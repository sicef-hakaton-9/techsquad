CREATE TABLE `account`
(
    `id`        BIGINT              NOT NULL AUTO_INCREMENT,
    `email`     VARCHAR(255) UNIQUE NOT NULL,
    `password`  VARCHAR(255)        NOT NULL,
    PRIMARY KEY (`id`)
)