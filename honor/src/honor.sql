/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/2/27 1:02:26                            */
/*==============================================================*/


drop table if exists address;

drop table if exists admin;

drop table if exists buyer;

drop table if exists cart;

drop table if exists collect;

drop table if exists orders;

drop table if exists pro_type;

drop table if exists product;

drop table if exists report;

drop table if exists seller;

drop table if exists store_type;

/*==============================================================*/
/* Table: address                                               */
/*==============================================================*/
create table address
(
   id                   int not null auto_increment,
   buyer_id             int,
   name                 varchar(50),
   tel                  int,
   address              varchar(255),
   is_default           varchar(5),
   primary key (id)
);

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   id                   int not null auto_increment,
   name                 varchar(50),
   password             varchar(100),
   primary key (id)
);

/*==============================================================*/
/* Table: buyer                                                 */
/*==============================================================*/
create table buyer
(
   id                   int not null auto_increment,
   name                 varchar(50),
   password             varchar(100),
   age                  int,
   sex                  varchar(10),
   email                varchar(200),
   level                varchar(100),
   nickname             varchar(50),
   tel                  varchar(11),
   head_img             varchar(200),
   primary key (id)
);

/*==============================================================*/
/* Table: cart                                                  */
/*==============================================================*/
create table cart
(
   id                   int not null auto_increment,
   buyer_id             int,
   product_id           int,
   num                  int,
   time                 timestamp,
   primary key (id)
);

/*==============================================================*/
/* Table: collect                                               */
/*==============================================================*/
create table collect
(
   id                   int not null auto_increment,
   product_id           int,
   buyer_id             int,
   primary key (id)
);

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   id                   int not null auto_increment,
   buyer_id             int,
   seller_id            int,
   code                 varchar(100),
   time                 timestamp,
   address_id           int,
   assess               text,
   assess_level         int,
   product_id           int,
   num                  int,
   status               int,
   rece_time            timestamp,
   primary key (id)
);

/*==============================================================*/
/* Table: pro_type                                              */
/*==============================================================*/
create table pro_type
(
   id                   int not null,
   store_type_id        int,
   type_name            varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   id                   int not null auto_increment,
   seller_id            int,
   name                 varchar(100),
   price_n              float,
   price_o              float,
   stock                int,
   pro_type_id          int,
   pro_desc             text,
   img1                 varchar(200),
   img2                 varchar(200),
   img3                 varchar(200),
   img4                 varchar(200),
   img5                 varchar(200),
   primary key (id)
);

/*==============================================================*/
/* Table: report                                                */
/*==============================================================*/
create table report
(
   id                   int not null auto_increment,
   msg                  text,
   msg_time             timestamp,
   primary key (id)
);

/*==============================================================*/
/* Table: seller                                                */
/*==============================================================*/
create table seller
(
   id                   int not null auto_increment,
   name                 varchar(50),
   password             varchar(100),
   store                varchar(100),
   email                varchar(100),
   tel                  varchar(11),
   id_card              varchar(20),
   address              varchar(200),
   level                int,
   is_active            varchar(5),
   head_img             varchar(200),
   store_img            varchar(200),
   seller_desc          text,
   store_type_id        int,
   is_locked            varchar(5),
   primary key (id)
);

/*==============================================================*/
/* Table: store_type                                            */
/*==============================================================*/
create table store_type
(
   id                   int not null auto_increment,
   type_name            varchar(20),
   primary key (id)
);

alter table address add constraint FK_Reference_5 foreign key (buyer_id)
      references buyer (id) on delete restrict on update restrict;

alter table cart add constraint FK_Reference_1 foreign key (buyer_id)
      references buyer (id) on delete restrict on update restrict;

alter table cart add constraint FK_Reference_2 foreign key (product_id)
      references product (id) on delete restrict on update restrict;

alter table collect add constraint FK_Reference_3 foreign key (buyer_id)
      references buyer (id) on delete restrict on update restrict;

alter table collect add constraint FK_Reference_4 foreign key (product_id)
      references product (id) on delete restrict on update restrict;

alter table orders add constraint FK_Reference_6 foreign key (buyer_id)
      references buyer (id) on delete restrict on update restrict;

alter table orders add constraint FK_Reference_7 foreign key (seller_id)
      references seller (id) on delete restrict on update restrict;

alter table orders add constraint FK_Reference_8 foreign key (address_id)
      references address (id) on delete restrict on update restrict;

alter table orders add constraint FK_Reference_9 foreign key (product_id)
      references product (id) on delete restrict on update restrict;

alter table pro_type add constraint FK_Reference_10 foreign key (store_type_id)
      references store_type (id) on delete restrict on update restrict;

