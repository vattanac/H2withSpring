
CREATE  TABLE  tb_category(
   id serial primary  key ,
   name varchar
);

CREATE TABLE tb_book(
  id serial PRIMARY KEY,
  title VARCHAR,
  author VARCHAR,
  publisher VARCHAR,
  thumbnail VARCHAR,
  cate_id INT REFERENCES tb_category(id)
);

