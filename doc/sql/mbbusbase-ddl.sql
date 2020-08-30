-- MySQL Script generated by MySQL Workbench
-- Sat Aug 29 16:09:36 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mBBusBase
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mBBusBase` ;

-- -----------------------------------------------------
-- Schema mBBusBase
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mBBusBase` DEFAULT CHARACTER SET utf8 ;
USE `mBBusBase` ;

-- -----------------------------------------------------
-- Table `mBBusBase`.`Route`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mBBusBase`.`Route` ;

CREATE TABLE IF NOT EXISTS `mBBusBase`.`Route` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mBBusBase`.`Bus`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mBBusBase`.`Bus` ;

CREATE TABLE IF NOT EXISTS `mBBusBase`.`Bus` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `route_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Bus_Route1_idx` (`route_id` ASC) VISIBLE,
  CONSTRAINT `fk_Bus_Route1`
    FOREIGN KEY (`route_id`)
    REFERENCES `mBBusBase`.`Route` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mBBusBase`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mBBusBase`.`User` ;

CREATE TABLE IF NOT EXISTS `mBBusBase`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `discriminator` INT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `password` VARCHAR(68) NULL,
  `role` VARCHAR(45) NULL,
  `bus_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_User_Bus1_idx` (`bus_id` ASC) VISIBLE,
  CONSTRAINT `fk_User_Bus1`
    FOREIGN KEY (`bus_id`)
    REFERENCES `mBBusBase`.`Bus` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mBBusBase`.`Assignment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mBBusBase`.`Assignment` ;

CREATE TABLE IF NOT EXISTS `mBBusBase`.`Assignment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NULL,
  `date` TIMESTAMP NULL,
  `user_id` INT NOT NULL,
  `route_id` INT NOT NULL,
  `bus_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Assignment_User1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_Assignment_Route1_idx` (`route_id` ASC) VISIBLE,
  INDEX `fk_Assignment_Bus1_idx` (`bus_id` ASC) VISIBLE,
  CONSTRAINT `fk_Assignment_User1`
    FOREIGN KEY (`user_id`)
    REFERENCES `mBBusBase`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Assignment_Route1`
    FOREIGN KEY (`route_id`)
    REFERENCES `mBBusBase`.`Route` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Assignment_Bus1`
    FOREIGN KEY (`bus_id`)
    REFERENCES `mBBusBase`.`Bus` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
