CREATE TABLE `company`
(
    `id`      BIGINT       NOT NULL AUTO_INCREMENT,
    `name`    varchar(255) NOT NULL,
    `pib`     BIGINT UNIQUE NOT NULL,
    `phone`    varchar(255) NOT NULL,
    `city`     varchar(255) NOT NULL,
    `account_id`BIGINT NOT NULL,

    PRIMARY KEY (`id`)
)

