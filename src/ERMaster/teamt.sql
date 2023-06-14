
/* Drop Tables */

DROP TABLE notice CASCADE CONSTRAINTS;
DROP TABLE qa_admin CASCADE CONSTRAINTS;
DROP TABLE admin_info CASCADE CONSTRAINTS;
DROP TABLE refund CASCADE CONSTRAINTS;
DROP TABLE purchase CASCADE CONSTRAINTS;
DROP TABLE qa CASCADE CONSTRAINTS;
DROP TABLE reservation CASCADE CONSTRAINTS;
DROP TABLE seat CASCADE CONSTRAINTS;
DROP TABLE user_info CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE admin_info
(
	w_id varchar2(50) NOT NULL,
	password number(6) NOT NULL,
	phone varchar2(50) NOT NULL,
	PRIMARY KEY (w_id)
);


CREATE TABLE notice
(
	t_num number NOT NULL,
	w_id varchar2(50) NOT NULL,
	time timestamp NOT NULL,
	content clob NOT NULL,
	title varchar2(50) NOT NULL,
	PRIMARY KEY (t_num)
);


CREATE TABLE purchase
(
	b_num number NOT NULL,
	id varchar2(50) NOT NULL,
	b_time timestamp NOT NULL,
	name varchar2(50) NOT NULL,
	price number NOT NULL,
	PRIMARY KEY (b_num)
);


CREATE TABLE qa
(
	t_num number NOT NULL,
	id varchar2(50) NOT NULL,
	time timestamp NOT NULL,
	title varchar2(50) NOT NULL,
	content clob NOT NULL,
	PRIMARY KEY (t_num)
);


CREATE TABLE qa_admin
(
	t_num number NOT NULL,
	w_id varchar2(50) NOT NULL,
	q_num number NOT NULL,
	time timestamp NOT NULL,
	title varchar2(50) NOT NULL,
	content clob NOT NULL,
	answer clob NOT NULL,
	PRIMARY KEY (t_num)
);


CREATE TABLE refund
(
	r_num number NOT NULL,
	b_num number NOT NULL,
	r_time timestamp NOT NULL,
	PRIMARY KEY (r_num)
);


CREATE TABLE reservation
(
	r_num number NOT NULL,
	id varchar2(50) NOT NULL,
	c_num number NOT NULL,
	s_time timestamp NOT NULL,
	c_time timestamp NOT NULL,
	PRIMARY KEY (r_num)
);


CREATE TABLE seat
(
	c_num number NOT NULL,
	oc number NOT NULL,
	PRIMARY KEY (c_num)
);


CREATE TABLE user_info
(
	id varchar2(50) NOT NULL,
	password number(6) NOT NULL,
	phone varchar2(50) NOT NULL,
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE notice
	ADD FOREIGN KEY (w_id)
	REFERENCES admin_info (w_id)
;


ALTER TABLE qa_admin
	ADD FOREIGN KEY (w_id)
	REFERENCES admin_info (w_id)
;


ALTER TABLE refund
	ADD FOREIGN KEY (b_num)
	REFERENCES purchase (b_num)
;


ALTER TABLE qa_admin
	ADD FOREIGN KEY (q_num)
	REFERENCES qa (t_num)
;


ALTER TABLE reservation
	ADD FOREIGN KEY (c_num)
	REFERENCES seat (c_num)
;


ALTER TABLE purchase
	ADD FOREIGN KEY (id)
	REFERENCES user_info (id)
;


ALTER TABLE qa
	ADD FOREIGN KEY (id)
	REFERENCES user_info (id)
;


ALTER TABLE reservation
	ADD FOREIGN KEY (id)
	REFERENCES user_info (id)
;



