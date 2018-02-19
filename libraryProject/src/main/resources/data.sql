INSERT INTO news_user
(id, email, hash_password, state, role)
  SELECT
    1,
    'admin@admin.com',
    '$2a$12$A8Acz2EF8drGXe8pVipgu.n0nepTfPzF7cneza0kU0C.fgmetwrLG',
    'CONFIRMED',
    'ADMIN'
  WHERE
    NOT EXISTS(
        SELECT id
        FROM news_user
        WHERE id = 1
    );

CREATE TABLE IF NOT EXISTS persistent_logins(
  username VARCHAR(64) NOT NULL ,
  series VARCHAR(64) NOT NULL ,
token VARCHAR(64) NOT NULL ,
  last_used TIMESTAMP NOT NULL
)