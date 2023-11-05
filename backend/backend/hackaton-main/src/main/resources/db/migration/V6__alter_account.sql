ALTER TABLE `account`
    ADD COLUMN role_id bigint NOT NULL DEFAULT 1;

ALTER TABLE `account`
    ADD FOREIGN KEY (role_id) REFERENCES role (id);