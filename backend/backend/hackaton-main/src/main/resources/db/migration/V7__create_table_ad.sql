CREATE TABLE `ad` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `description` VARCHAR(2000) NOT NULL,
    `category` VARCHAR(255) NOT NULL,
    `date` DATE NOT NULL,
     company_id BIGINT NOT NULL,

    PRIMARY KEY (`id`),
    FOREIGN KEY (company_id) REFERENCES company(id)
);
