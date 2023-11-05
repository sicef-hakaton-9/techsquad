CREATE TABLE `role`
(
    `id`   BIGINT              NOT NULL AUTO_INCREMENT,
    `name` varchar(255) UNIQUE NOT NULL,

    PRIMARY KEY (`id`)
)