# MBBusBaseSpring

Registration page - пользователь может зарегестрироваться на сайте.
Login page - пользователь может залогиниться на сайте
Admin/profile -  администратор после логина имеет доступ к своему профилю для просмотра 
и внесения изменений
Driver/profile - аналогично администратору, реализация для водителя
Admin/routes - администратор может видеть список свободных и занятых маршрутов 
и их загруженность
Admin/buses - администратор может видеть список автобусов и их занятость (водитель? маршрут?)
Admin/drivers - администратор может видеть список свободных/занятых водителей
Admin/assignments - администратор может видеть список назначений и их статусов 
(приветствуется функция сортировки по статусу)
Admin/assignment/create - администратор формирует новое назначение с получением статуса "expected"
до изменения этого статуса назначенным водителем
Admin/assignment/edit - администратор может редактировать назначение изменяя маршрут/
водителя/автобус. При смене водителя, назначение удаляется из назначений прошлого 
водителя и появляется в статусе "expected" у ново-назначенного
Admin/assignment/delete - администратор может полностью удалить назначение, одновременно удаляя его у водителя.
(Приветствуется валидация назначения по статусу т.е "назначение находится в статусе "active",
 вы уверены что хотите удалить назначение?")
Driver/assignmens - список всех назначений водителя(приветствуется сортировка по статусу)
Driver/assignment - при выборе конкретного назначения из списка, водитель может увидеть 
детали назначения(get) и принять/отклонить назначение (post)