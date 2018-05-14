-- 专业类别表
CREATE TABLE newer_major
(
    mid int PRIMARY KEY AUTO_INCREMENT,  -- 主键ID
    mname varchar(100),    -- 专业名字 Java/测试/前端
    mcode varchar(20),     -- 专业代码 J/C/W
    spare1 int,    -- 备用
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);

INSERT INTO newersms.newer_major (mid, mname, mcode, spare1, spare2, spare3, spare4) VALUES (1, 'Java', 'J', null, null, null, null);
INSERT INTO newersms.newer_major (mid, mname, mcode, spare1, spare2, spare3, spare4) VALUES (2, '测试', 'C', null, null, null, null);
INSERT INTO newersms.newer_major (mid, mname, mcode, spare1, spare2, spare3, spare4) VALUES (3, '前端', 'W', null, null, null, null);


-- 校区表
CREATE TABLE newer_campus
(
    cid int PRIMARY KEY AUTO_INCREMENT,  -- 主键ID
    cname varchar(100),  -- 校区名字
    ccode varchar(100),  -- 校区代码
    cloc varchar(200),   -- 所在地址
    telephone varchar(100),  -- 联系电话
    spare1 int,
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);

INSERT INTO newersms.newer_campus (cid, cname, ccode, cloc, telephone, spare1, spare2, spare3, spare4) VALUES (1, '五一校区', 'W', '湖南省电化教育馆二楼', null, null, null, null, null);
INSERT INTO newersms.newer_campus (cid, cname, ccode, cloc, telephone, spare1, spare2, spare3, spare4) VALUES (2, '林科大校区', 'L', '林科大', null, null, null, null, null);
INSERT INTO newersms.newer_campus (cid, cname, ccode, cloc, telephone, spare1, spare2, spare3, spare4) VALUES (3, '涉外校区', 'S', '涉外经济学院', null, null, null, null, null);

-- 校区职业表
CREATE TABLE newer_job
(
    jid int PRIMARY KEY AUTO_INCREMENT,   -- 主键ID
    jname varchar(100),                   -- 职位名称： 督导/教员/咨询师
    responsibility varchar(200),        -- 职责
    spare1 int,
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);

INSERT INTO newersms.newer_job (jid, jname, responsibility, spare1, spare2, spare3, spare4) VALUES (1, '督导', '管理学生', null, null, null, null);
INSERT INTO newersms.newer_job (jid, jname, responsibility, spare1, spare2, spare3, spare4) VALUES (2, '教员', '上课', null, null, null, null);
INSERT INTO newersms.newer_job (jid, jname, responsibility, spare1, spare2, spare3, spare4) VALUES (3, '咨询师', '提供专业的咨询', null, null, null, null);


-- 校区职员表
CREATE TABLE newer_worker
(
    worker_id int PRIMARY KEY AUTO_INCREMENT,   -- 主键ID
    worker_name varchar(100),     -- 职员名字
    jid int,               -- 校区职业表外键
    sex varchar(20),     -- 性别
    birth date,          -- 出生日期
    telephone varchar(50),   -- 联系电话
    spare1 int,
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);
ALTER TABLE newer_worker
ADD CONSTRAINT newer_worker__job_fk
FOREIGN KEY (jid) REFERENCES newer_job (jid);

INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (1, '付美丽', 1, '女', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (2, '苏阳', 1, '女', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (3, '宋雄伟', 2, '男', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (4, '付亮', 2, '女', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (5, '蒋依铭', 2, '男', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (6, '罗亚洲', 2, '男', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (7, '吴佳', 3, '女', null, null, null, null, null, null);
INSERT INTO newersms.newer_worker (worker_id, worker_name, jid, sex, birth, telephone, spare1, spare2, spare3, spare4) VALUES (8, 'Apple', 3, '女', null, null, null, null, null, null);

-- 学员信息来源表
CREATE TABLE newer_info_source
(
    info_id int PRIMARY KEY AUTO_INCREMENT,  -- 主键ID
    info_name varchar(100),   -- 来源名称
    spare1 int,
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);

INSERT INTO newersms.newer_info_source (info_id, info_name, spare1, spare2, spare3, spare4) VALUES (1, '招生代理', null, null, null, null);
INSERT INTO newersms.newer_info_source (info_id, info_name, spare1, spare2, spare3, spare4) VALUES (2, '工作人员', null, null, null, null);
INSERT INTO newersms.newer_info_source (info_id, info_name, spare1, spare2, spare3, spare4) VALUES (3, '亲友', null, null, null, null);
INSERT INTO newersms.newer_info_source (info_id, info_name, spare1, spare2, spare3, spare4) VALUES (4, '老师', null, null, null, null);
INSERT INTO newersms.newer_info_source (info_id, info_name, spare1, spare2, spare3, spare4) VALUES (5, '同学', null, null, null, null);
INSERT INTO newersms.newer_info_source (info_id, info_name, spare1, spare2, spare3, spare4) VALUES (6, '其它', null, null, null, null);

-- 学员分类表/标签表
CREATE TABLE newer_tag
(
    tag_id int PRIMARY KEY AUTO_INCREMENT,  -- 主键ID
    tag_name varchar(100),  -- 标签名/分类名
    tag_detail varchar(200),  -- 说明/备注
    spare1 int,
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);

INSERT INTO newersms.newer_tag (tag_id, tag_name, tag_detail, spare1, spare2, spare3, spare4) VALUES (1, 'A类', 'A类', null, null, null, null);
INSERT INTO newersms.newer_tag (tag_id, tag_name, tag_detail, spare1, spare2, spare3, spare4) VALUES (2, 'B类', 'B类', null, null, null, null);
INSERT INTO newersms.newer_tag (tag_id, tag_name, tag_detail, spare1, spare2, spare3, spare4) VALUES (3, 'C类', 'C类', null, null, null, null);

-- 缴费类型表
CREATE TABLE newer_fees_type
(
    nft_id int PRIMARY KEY AUTO_INCREMENT, -- 主键ID
    nft_name varchar(100),  -- 学费/住宿费/教材费/其它
    nft_remark varchar(200),  -- 备注
    spare1 int,
    spare2 int,
    spare3 varchar(200),
    spare4 varchar(200)
);

INSERT INTO newersms.newer_fees_type (nft_id, nft_name, nft_remark, spare1, spare2, spare3, spare4) VALUES (1, '学费', '学费', null, null, null, null);
INSERT INTO newersms.newer_fees_type (nft_id, nft_name, nft_remark, spare1, spare2, spare3, spare4) VALUES (2, '教材费', '教材费', null, null, null, null);
INSERT INTO newersms.newer_fees_type (nft_id, nft_name, nft_remark, spare1, spare2, spare3, spare4) VALUES (3, '住宿费', '住宿费', null, null, null, null);