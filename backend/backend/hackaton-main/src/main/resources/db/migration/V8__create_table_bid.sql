CREATE TABLE `bid` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `price` DOUBLE NOT NULL,
    `availability_date` DATE NOT NULL,
    `company_id` BIGINT NOT NULL,
    PRIMARY KEY (`id`)
);

ALTER TABLE `bid`
ADD CONSTRAINT fk_company2 FOREIGN KEY (company_id) REFERENCES `company`(id);