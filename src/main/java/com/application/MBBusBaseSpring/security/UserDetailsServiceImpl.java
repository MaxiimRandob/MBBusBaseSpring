package com.application.MBBusBaseSpring.security;

import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private static final Logger LOG = LogManager.getLogger(UserDetailsServiceImpl.class);

    @Resource
    UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        LOG.info("checking for user: " + username);
        Optional<User> userOptional = userRepository.findByUsername(username);

        if(!userOptional.isPresent()) {
            throw new UsernameNotFoundException("User not found.");
        }

        LOG.info("loading user with username here: " + userOptional.get().getUsername());
        return new CustomUserDetails(userOptional.get());
    }
}
