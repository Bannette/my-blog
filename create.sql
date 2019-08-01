CREATE DATABASE myblog;
\c myblog;
CREATE TABLE tasks (id SERIAL PRIMARY KEY, description VARCHAR, completed BOOLEAN, categoryid INTEGER);
CREATE TABLE categories (id SERIAL PRIMARY KEY, name VARCHAR);
CREATE DATABASE myblog_test WITH TEMPLATE myblog;
