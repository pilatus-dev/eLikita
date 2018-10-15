PGDMP     $                    v            SchoolManagement    10.1    10.1 �   H           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            I           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            J           1262    16384    SchoolManagement    DATABASE     �   CREATE DATABASE "SchoolManagement" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United Kingdom.1252' LC_CTYPE = 'English_United Kingdom.1252';
 "   DROP DATABASE "SchoolManagement";
             admin    false                        2615    41404    administrator    SCHEMA        CREATE SCHEMA administrator;
    DROP SCHEMA administrator;
             admin    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            K           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3            	            2615    16726    referential    SCHEMA        CREATE SCHEMA referential;
    DROP SCHEMA referential;
             admin    false                        3079    12278    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            L           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            3           1259    106889    academic_year    TABLE     �   CREATE TABLE academic_year (
    id bigint NOT NULL,
    status_fk bigint,
    end_month_fk bigint,
    start_month_fk bigint,
    end_year_fk bigint,
    start_year_fk bigint
);
 (   DROP TABLE administrator.academic_year;
       administrator         admin    false    4            1           1259    106874    application_user    TABLE     )  CREATE TABLE application_user (
    id bigint NOT NULL,
    name character varying(50),
    email character varying(50) NOT NULL,
    password character varying(100),
    is_active boolean,
    meta_data character varying(100),
    last_update timestamp without time zone,
    is_admin boolean
);
 +   DROP TABLE administrator.application_user;
       administrator         admin    false    4            M           0    0     COLUMN application_user.password    COMMENT     4   COMMENT ON COLUMN application_user.password IS '
';
            administrator       admin    false    305            0           1259    106872    application_user_id_seq    SEQUENCE     y   CREATE SEQUENCE application_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE administrator.application_user_id_seq;
       administrator       admin    false    305    4            N           0    0    application_user_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE application_user_id_seq OWNED BY application_user.id;
            administrator       admin    false    304                       1259    49530 
   attendance    TABLE     )  CREATE TABLE attendance (
    id bigint NOT NULL,
    student_fk character varying(30),
    class_fk character varying(10),
    class_enrollment_date timestamp without time zone,
    class_drop_date timestamp without time zone,
    drop_class_reason_fk bigint,
    attendance_outcome_fk bigint
);
 %   DROP TABLE administrator.attendance;
       administrator         admin    false    4                       1259    49528    attendance_id_seq    SEQUENCE     s   CREATE SEQUENCE attendance_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE administrator.attendance_id_seq;
       administrator       admin    false    277    4            O           0    0    attendance_id_seq    SEQUENCE OWNED BY     9   ALTER SEQUENCE attendance_id_seq OWNED BY attendance.id;
            administrator       admin    false    276            �            1259    41453    class_schedule    TABLE     �   CREATE TABLE class_schedule (
    id bigint NOT NULL,
    class_fk character varying(15),
    start_time timestamp without time zone,
    end_time timestamp without time zone
);
 )   DROP TABLE administrator.class_schedule;
       administrator         admin    false    4            �            1259    41451    class_schedule_id_seq    SEQUENCE     w   CREATE SEQUENCE class_schedule_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE administrator.class_schedule_id_seq;
       administrator       admin    false    251    4            P           0    0    class_schedule_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE class_schedule_id_seq OWNED BY class_schedule.id;
            administrator       admin    false    250                       1259    41505    contact_person_student    TABLE     �   CREATE TABLE contact_person_student (
    id bigint NOT NULL,
    contact_person_fk bigint,
    student_fk character varying(50),
    contact_person_type_fk bigint
);
 1   DROP TABLE administrator.contact_person_student;
       administrator         admin    false    4                       1259    41503    contact_person_student_id_seq    SEQUENCE        CREATE SEQUENCE contact_person_student_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ;   DROP SEQUENCE administrator.contact_person_student_id_seq;
       administrator       admin    false    268    4            Q           0    0    contact_person_student_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE contact_person_student_id_seq OWNED BY contact_person_student.id;
            administrator       admin    false    267            �            1259    41425    fee_student    TABLE     ]  CREATE TABLE fee_student (
    id bigint NOT NULL,
    fee_fk character varying(10),
    student_fk character varying(30),
    effective_from time without time zone,
    amount numeric,
    discount_fk character varying(10),
    status_fk character varying(10),
    due_date timestamp without time zone,
    last_date timestamp without time zone
);
 &   DROP TABLE administrator.fee_student;
       administrator         admin    false    4            �            1259    41423    fee_student_id_seq    SEQUENCE     t   CREATE SEQUENCE fee_student_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE administrator.fee_student_id_seq;
       administrator       admin    false    243    4            R           0    0    fee_student_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE fee_student_id_seq OWNED BY fee_student.id;
            administrator       admin    false    242            �            1259    41416    fees    TABLE     �   CREATE TABLE fees (
    id bigint NOT NULL,
    fee_heading character varying(20),
    amount numeric,
    class_fk character varying(15),
    fee_type_fk character varying(15),
    code character varying(10)
);
    DROP TABLE administrator.fees;
       administrator         admin    false    4            �            1259    41414    fees_id_seq    SEQUENCE     m   CREATE SEQUENCE fees_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE administrator.fees_id_seq;
       administrator       admin    false    241    4            S           0    0    fees_id_seq    SEQUENCE OWNED BY     -   ALTER SEQUENCE fees_id_seq OWNED BY fees.id;
            administrator       admin    false    240                       1259    41491    instructor_presence    TABLE     �   CREATE TABLE instructor_presence (
    instructor_fk character varying(50),
    class_schedule_fk character varying(10),
    present boolean,
    dates timestamp without time zone,
    additional_info character varying(50),
    id bigint NOT NULL
);
 .   DROP TABLE administrator.instructor_presence;
       administrator         admin    false    4                       1259    41542    instructor_presence_id_seq    SEQUENCE     |   CREATE SEQUENCE instructor_presence_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE administrator.instructor_presence_id_seq;
       administrator       admin    false    263    4            T           0    0    instructor_presence_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE instructor_presence_id_seq OWNED BY instructor_presence.id;
            administrator       admin    false    270            7           1259    115078    journee    TABLE     �   CREATE TABLE journee (
    id bigint NOT NULL,
    journee character varying(100),
    etat boolean,
    owner character varying(50),
    last_update timestamp without time zone
);
 "   DROP TABLE administrator.journee;
       administrator         admin    false    4            6           1259    115076    journee_id_seq    SEQUENCE     p   CREATE SEQUENCE journee_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE administrator.journee_id_seq;
       administrator       admin    false    311    4            U           0    0    journee_id_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE journee_id_seq OWNED BY journee.id;
            administrator       admin    false    310            =           1259    123309    log_info    TABLE     �   CREATE TABLE log_info (
    id bigint NOT NULL,
    log_name character varying(100),
    code character varying(100),
    description character varying(100)
);
 #   DROP TABLE administrator.log_info;
       administrator         admin    false    4            >           1259    123312    log_info_id_seq    SEQUENCE     q   CREATE SEQUENCE log_info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE administrator.log_info_id_seq;
       administrator       admin    false    317    4            V           0    0    log_info_id_seq    SEQUENCE OWNED BY     5   ALTER SEQUENCE log_info_id_seq OWNED BY log_info.id;
            administrator       admin    false    318            2           1259    106887    r_academic_year_id_seq    SEQUENCE     x   CREATE SEQUENCE r_academic_year_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE administrator.r_academic_year_id_seq;
       administrator       admin    false    4    307            W           0    0    r_academic_year_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE r_academic_year_id_seq OWNED BY academic_year.id;
            administrator       admin    false    306            5           1259    115068    ro_users    TABLE     �  CREATE TABLE ro_users (
    id bigint NOT NULL,
    "user" character varying(50),
    user_type character varying(50),
    comptable character varying(50),
    service character varying(50),
    user_name character varying(50),
    date_created timestamp without time zone,
    disable_date timestamp without time zone,
    disabled boolean,
    granted_process character varying(50),
    granted_numbering character varying(50)
);
 #   DROP TABLE administrator.ro_users;
       administrator         admin    false    4            4           1259    115066    ro_utilisateurs_id_seq    SEQUENCE     x   CREATE SEQUENCE ro_utilisateurs_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE administrator.ro_utilisateurs_id_seq;
       administrator       admin    false    4    309            X           0    0    ro_utilisateurs_id_seq    SEQUENCE OWNED BY     <   ALTER SEQUENCE ro_utilisateurs_id_seq OWNED BY ro_users.id;
            administrator       admin    false    308                       1259    41488    student_presence    TABLE     �   CREATE TABLE student_presence (
    student_fk character varying(50),
    class_schedule_fk character varying(50),
    present boolean,
    dates timestamp without time zone,
    additional_info character varying(50),
    id bigint NOT NULL
);
 +   DROP TABLE administrator.student_presence;
       administrator         admin    false    4                       1259    41550    student_presence_id_seq    SEQUENCE     y   CREATE SEQUENCE student_presence_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE administrator.student_presence_id_seq;
       administrator       admin    false    262    4            Y           0    0    student_presence_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE student_presence_id_seq OWNED BY student_presence.id;
            administrator       admin    false    271                       1259    41472    teach    TABLE       CREATE TABLE teach (
    id bigint NOT NULL,
    instructor_fk character varying(30),
    class_fk character varying(10),
    start_date timestamp without time zone,
    end_date timestamp without time zone,
    drop_teach_reason_fk bigint,
    teach_outcome_fk bigint
);
     DROP TABLE administrator.teach;
       administrator         admin    false    4                        1259    41470    teach_id_seq    SEQUENCE     n   CREATE SEQUENCE teach_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE administrator.teach_id_seq;
       administrator       admin    false    257    4            Z           0    0    teach_id_seq    SEQUENCE OWNED BY     /   ALTER SEQUENCE teach_id_seq OWNED BY teach.id;
            administrator       admin    false    256            �            1259    41434    transaction    TABLE     �   CREATE TABLE transaction (
    id bigint NOT NULL,
    fee_fk character varying(10),
    student_fk character varying(30),
    amount character varying(10),
    description character varying(50),
    remarks character varying(50)
);
 &   DROP TABLE administrator.transaction;
       administrator         admin    false    4            �            1259    41432    transaction_id_seq    SEQUENCE     t   CREATE SEQUENCE transaction_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE administrator.transaction_id_seq;
       administrator       admin    false    245    4            [           0    0    transaction_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE transaction_id_seq OWNED BY transaction.id;
            administrator       admin    false    244            �            1259    16386    about_institution    TABLE     [  CREATE TABLE about_institution (
    institution_name character varying(255),
    address character varying(255),
    city character varying(255),
    code character varying(255),
    description character varying(255),
    email character varying(255),
    postcode character varying(255),
    region character varying(255),
    website character varying(255),
    id bigint NOT NULL,
    owner_fname character varying(50),
    owner_lname character varying(50),
    business_category bigint,
    country_fk bigint,
    phone_no bigint,
    year_established bigint,
    campus character varying(50)
);
 %   DROP TABLE public.about_institution;
       public         admin    false    3            \           0    0 *   COLUMN about_institution.business_category    COMMENT     >   COMMENT ON COLUMN about_institution.business_category IS '
';
            public       admin    false    198            �            1259    16778    about_institution_id_seq    SEQUENCE     z   CREATE SEQUENCE about_institution_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.about_institution_id_seq;
       public       admin    false    198    3            ]           0    0    about_institution_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE about_institution_id_seq OWNED BY about_institution.id;
            public       admin    false    231            �            1259    16394    academic_qualification    TABLE     �  CREATE TABLE academic_qualification (
    id bigint NOT NULL,
    country character varying(255),
    date_of_award character varying(255),
    end_date timestamp without time zone,
    institution_name character varying(255),
    other_achievement character varying(255),
    title_of_qualification character varying(255),
    result character varying(255),
    start_date timestamp without time zone,
    subject character varying(255)
);
 *   DROP TABLE public.academic_qualification;
       public         admin    false    3            �            1259    16402    account_profile    TABLE     %  CREATE TABLE account_profile (
    id bigint NOT NULL,
    code character varying(255),
    name character varying(255),
    when_delete timestamp without time zone,
    when_done timestamp without time zone,
    when_update timestamp without time zone,
    who_done character varying(255)
);
 #   DROP TABLE public.account_profile;
       public         admin    false    3            �            1259    16410    additional_info    TABLE     m  CREATE TABLE additional_info (
    id bigint NOT NULL,
    student_fk character varying(50),
    disability_fk bigint,
    ethnicity_fk bigint,
    mother_tongue_fk bigint,
    religion_fk bigint,
    criminal_conviction character varying(50),
    bring_partner character varying(255),
    disability character varying(255),
    ethnicity character varying(255)
);
 #   DROP TABLE public.additional_info;
       public         admin    false    3                       1259    65914    additional_info_id_seq    SEQUENCE     x   CREATE SEQUENCE additional_info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.additional_info_id_seq;
       public       admin    false    201    3            ^           0    0    additional_info_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE additional_info_id_seq OWNED BY additional_info.id;
            public       admin    false    281            �            1259    16418    address_detail    TABLE       CREATE TABLE address_detail (
    city character varying(255),
    postcode character varying(255),
    address character varying(255),
    region character varying(255),
    id bigint NOT NULL,
    student_fk character varying(30),
    permanent_address character varying(255),
    primary_number bigint,
    home_number bigint,
    email character varying(50),
    country_fk bigint,
    country character varying(255),
    present_address character varying(255),
    valid_until timestamp without time zone
);
 "   DROP TABLE public.address_detail;
       public         admin    false    3            �            1259    41336    address_detail_id_seq    SEQUENCE     w   CREATE SEQUENCE address_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.address_detail_id_seq;
       public       admin    false    202    3            _           0    0    address_detail_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE address_detail_id_seq OWNED BY address_detail.id;
            public       admin    false    235            �            1259    16426    annoucement    TABLE     {   CREATE TABLE annoucement (
    id bigint NOT NULL,
    message character varying(255),
    title character varying(255)
);
    DROP TABLE public.annoucement;
       public         admin    false    3            �            1259    16439    application_detail    TABLE     �  CREATE TABLE application_detail (
    admission_officer character varying(255),
    code character varying(255),
    course_fk character varying(255),
    faculty character varying(255),
    finish_date timestamp without time zone,
    location_ character varying(255),
    mode_of_attendance character varying(255),
    start_date timestamp without time zone,
    status character varying(255),
    batch_fk bigint,
    id bigint NOT NULL,
    academic_year character varying(20)
);
 &   DROP TABLE public.application_detail;
       public         admin    false    3            <           1259    123276    application_detail_id_seq    SEQUENCE     {   CREATE SEQUENCE application_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.application_detail_id_seq;
       public       admin    false    3    204            `           0    0    application_detail_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE application_detail_id_seq OWNED BY application_detail.id;
            public       admin    false    316            /           1259    98682    assign_subject    TABLE     z   CREATE TABLE assign_subject (
    id bigint NOT NULL,
    course_fk bigint,
    batch_fk bigint,
    subject_fk bigint
);
 "   DROP TABLE public.assign_subject;
       public         admin    false    3            .           1259    98680    assign_subject_id_seq    SEQUENCE     w   CREATE SEQUENCE assign_subject_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.assign_subject_id_seq;
       public       admin    false    303    3            a           0    0    assign_subject_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE assign_subject_id_seq OWNED BY assign_subject.id;
            public       admin    false    302            -           1259    90490 
   assignment    TABLE     �   CREATE TABLE assignment (
    id bigint NOT NULL,
    title character varying(50),
    description character varying(50),
    course_fk bigint,
    batch_fk bigint,
    subject_fk bigint,
    date_submission timestamp without time zone
);
    DROP TABLE public.assignment;
       public         admin    false    3            ,           1259    90488    assignment_id_seq    SEQUENCE     s   CREATE SEQUENCE assignment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.assignment_id_seq;
       public       admin    false    3    301            b           0    0    assignment_id_seq    SEQUENCE OWNED BY     9   ALTER SEQUENCE assignment_id_seq OWNED BY assignment.id;
            public       admin    false    300            �            1259    16447    bank_account    TABLE     �   CREATE TABLE bank_account (
    id bigint NOT NULL,
    account_number bigint,
    sort_code character varying(255),
    student_id bigint
);
     DROP TABLE public.bank_account;
       public         admin    false    3            �            1259    16452    batch    TABLE     �   CREATE TABLE batch (
    batch_name character varying(255),
    end_date timestamp without time zone,
    max_student bigint,
    start_date timestamp without time zone,
    course_fk bigint,
    id bigint NOT NULL,
    course_id bigint
);
    DROP TABLE public.batch;
       public         admin    false    3            %           1259    74104    batch_id_seq    SEQUENCE     n   CREATE SEQUENCE batch_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.batch_id_seq;
       public       admin    false    3    206            c           0    0    batch_id_seq    SEQUENCE OWNED BY     /   ALTER SEQUENCE batch_id_seq OWNED BY batch.id;
            public       admin    false    293            �            1259    16457    classe    TABLE     �  CREATE TABLE classe (
    id bigint NOT NULL,
    name_ character varying(15),
    class_type_fk bigint,
    level_fk bigint,
    description character varying(50),
    start_date timestamp without time zone,
    end_date timestamp without time zone,
    completed boolean,
    student_number bigint,
    class_number bigint,
    student_no character varying(255),
    lecturer_fk bigint,
    module_fk bigint
);
    DROP TABLE public.classe;
       public         admin    false    3            �            1259    33144    classe_id_seq    SEQUENCE     o   CREATE SEQUENCE classe_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.classe_id_seq;
       public       admin    false    3    207            d           0    0    classe_id_seq    SEQUENCE OWNED BY     1   ALTER SEQUENCE classe_id_seq OWNED BY classe.id;
            public       admin    false    233            �            1259    16462    contact_detail    TABLE     �  CREATE TABLE contact_detail (
    email character varying(255),
    ermergency_address character varying(255),
    ermergency_name character varying(255),
    ermergency_relation character varying(255),
    ermergency_number character varying(255),
    primary_phoneno bigint,
    secondary_phoneno bigint,
    skype_address character varying(255),
    student_fk character varying(30),
    id bigint NOT NULL
);
 "   DROP TABLE public.contact_detail;
       public         admin    false    3            �            1259    41365    contact_detail_id_seq    SEQUENCE     w   CREATE SEQUENCE contact_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.contact_detail_id_seq;
       public       admin    false    208    3            e           0    0    contact_detail_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE contact_detail_id_seq OWNED BY contact_detail.id;
            public       admin    false    237            �            1259    16470    course    TABLE     z  CREATE TABLE course (
    code character varying(255),
    department character varying(255),
    title character varying(255),
    status character varying(255),
    id bigint NOT NULL,
    description character varying(50),
    syllabus_fk bigint,
    attendance_type_fk bigint,
    min_attendance_percentage bigint,
    total_working_days bigint,
    academic_year character varying(255),
    faculty character varying(255),
    location character varying(255),
    mode_of_attendance character varying(255),
    start_date timestamp without time zone,
    tutor character varying(255),
    year_of_study character varying(255)
);
    DROP TABLE public.course;
       public         admin    false    3            �            1259    24958    course_id_seq    SEQUENCE     o   CREATE SEQUENCE course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.course_id_seq;
       public       admin    false    209    3            f           0    0    course_id_seq    SEQUENCE OWNED BY     1   ALTER SEQUENCE course_id_seq OWNED BY course.id;
            public       admin    false    232            �            1259    16478 
   department    TABLE     �   CREATE TABLE department (
    id bigint NOT NULL,
    code character varying(255),
    description character varying(255),
    name character varying(255),
    status character varying(255)
);
    DROP TABLE public.department;
       public         admin    false    3            �            1259    16486    dw_dimensions    TABLE     �   CREATE TABLE dw_dimensions (
    id bigint NOT NULL,
    iid character varying(255),
    champ character varying(255),
    entite character varying(255),
    typechamp character varying(255),
    valeur character varying(1000)
);
 !   DROP TABLE public.dw_dimensions;
       public         admin    false    3                       1259    65927    educational_detail    TABLE     h  CREATE TABLE educational_detail (
    id bigint NOT NULL,
    institution_name character varying(50),
    qualification_fk bigint,
    subject_fk bigint,
    date_qualification_started timestamp without time zone,
    date_qualification_ended timestamp without time zone,
    final_grade numeric,
    completed boolean,
    student_fk character varying(50)
);
 &   DROP TABLE public.educational_detail;
       public         admin    false    3                       1259    65925    educational_detail_id_seq    SEQUENCE     {   CREATE SEQUENCE educational_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.educational_detail_id_seq;
       public       admin    false    283    3            g           0    0    educational_detail_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE educational_detail_id_seq OWNED BY educational_detail.id;
            public       admin    false    282                       1259    41494    emergency_contact    TABLE       CREATE TABLE emergency_contact (
    phone bigint,
    mobile bigint,
    email character varying(100),
    id bigint NOT NULL,
    full_name character varying(50),
    address character varying(50),
    relationship character varying(25),
    student_fk character varying(50)
);
 %   DROP TABLE public.emergency_contact;
       public         admin    false    3                       1259    41509    emergency_contact_id_seq    SEQUENCE     z   CREATE SEQUENCE emergency_contact_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.emergency_contact_id_seq;
       public       admin    false    264    3            h           0    0    emergency_contact_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE emergency_contact_id_seq OWNED BY emergency_contact.id;
            public       admin    false    269                       1259    65983    equality_data    TABLE     �  CREATE TABLE equality_data (
    id bigint NOT NULL,
    country_birth character varying(255),
    ethnic_origin character varying(255),
    learning_disabilities character varying(255),
    occupation character varying(255),
    original_gender character varying(255),
    religion character varying(255),
    sexual_orientation character varying(255),
    socio_economic_classification character varying(255)
);
 !   DROP TABLE public.equality_data;
       public         admin    false    3            �            1259    16502    event    TABLE     �   CREATE TABLE event (
    id bigint NOT NULL,
    description character varying(255),
    end_date timestamp without time zone,
    start_date timestamp without time zone,
    title character varying(255)
);
    DROP TABLE public.event;
       public         admin    false    3            �            1259    16510 
   experience    TABLE     o  CREATE TABLE experience (
    id bigint NOT NULL,
    city character varying(255),
    country character varying(255),
    employer_address character varying(255),
    employer_name character varying(255),
    end_date character varying(255),
    job_title character varying(255),
    responsibilities character varying(255),
    start_date character varying(255)
);
    DROP TABLE public.experience;
       public         admin    false    3            �            1259    16518    finance    TABLE     �   CREATE TABLE finance (
    id bigint NOT NULL,
    account_name character varying(255),
    account_number character varying(255),
    sort_code character varying(255)
);
    DROP TABLE public.finance;
       public         admin    false    3            �            1259    16657    hibernate_sequence    SEQUENCE     t   CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public       admin    false    3            �            1259    16534    information_statistic    TABLE     �   CREATE TABLE information_statistic (
    id bigint NOT NULL,
    about_us character varying(255),
    other_about_us character varying(255),
    other_application timestamp without time zone
);
 )   DROP TABLE public.information_statistic;
       public         admin    false    3            �            1259    16542    institution    TABLE     �  CREATE TABLE institution (
    id bigint NOT NULL,
    created timestamp without time zone,
    industry character varying(255),
    address character varying(255),
    city character varying(255),
    code character varying(255),
    country character varying(255),
    currency character varying(255),
    email character varying(255),
    fax character varying(255),
    language character varying(255),
    logo character varying(255),
    mobile character varying(255),
    name character varying(255),
    phone character varying(255),
    postcode character varying(255),
    region character varying(255),
    timezone character varying(255),
    website character varying(255),
    status character varying(255)
);
    DROP TABLE public.institution;
       public         admin    false    3            �            1259    16550    institutionregistration    TABLE     <  CREATE TABLE institutionregistration (
    id bigint NOT NULL,
    abn character varying(255),
    address character varying(255),
    business_email character varying(255),
    business_name character varying(255),
    business_phone character varying(255),
    business_size character varying(255),
    business_website character varying(255),
    city character varying(255),
    country character varying(255),
    created timestamp without time zone,
    current_advertisement character varying(255),
    email character varying(255),
    fax character varying(255),
    first_name character varying(255),
    industry character varying(255),
    last_name character varying(255),
    phone character varying(255),
    postcode character varying(255),
    state character varying(255),
    status character varying(255)
);
 +   DROP TABLE public.institutionregistration;
       public         admin    false    3            �            1259    16558    lecturer    TABLE     �  CREATE TABLE lecturer (
    id bigint NOT NULL,
    birth_date timestamp without time zone,
    last_name character varying(255),
    first_name character varying(255),
    gender bytea,
    middle_name character varying(255),
    prefered_name character varying(255),
    title character varying(255),
    date_of_birth timestamp without time zone,
    family_name character varying(255)
);
    DROP TABLE public.lecturer;
       public         admin    false    3            �            1259    16566    module    TABLE     �   CREATE TABLE module (
    id bigint NOT NULL,
    code character varying(255),
    description bigint,
    period character varying(255),
    title character varying(255),
    year character varying(255)
);
    DROP TABLE public.module;
       public         admin    false    3            �            1259    16574    nationality_detail    TABLE     �  CREATE TABLE nationality_detail (
    id bigint NOT NULL,
    nationality_fk bigint,
    permanent_residence_fk bigint,
    residential_status_fk bigint,
    student_fk character varying(50),
    passport_no character varying(50),
    issue_date timestamp without time zone,
    expiry_date timestamp without time zone,
    issue_place character varying(50),
    name_on_passport character varying(50),
    identification_type_fk bigint
);
 &   DROP TABLE public.nationality_detail;
       public         admin    false    3                       1259    65948    nationality_detail_id_seq    SEQUENCE     {   CREATE SEQUENCE nationality_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.nationality_detail_id_seq;
       public       admin    false    220    3            i           0    0    nationality_detail_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE nationality_detail_id_seq OWNED BY nationality_detail.id;
            public       admin    false    284            �            1259    16582    note    TABLE     �   CREATE TABLE note (
    id bigint NOT NULL,
    batch character varying(255),
    course character varying(255),
    attachment character varying(255),
    description bigint,
    title bigint,
    subject character varying(255)
);
    DROP TABLE public.note;
       public         admin    false    3            �            1259    16590    parent_info    TABLE       CREATE TABLE parent_info (
    id bigint NOT NULL,
    date_of_birth timestamp without time zone,
    first_name character varying(255),
    gender character varying(255),
    last_name character varying(255),
    other_info timestamp without time zone,
    student_fk bigint
);
    DROP TABLE public.parent_info;
       public         admin    false    3            �            1259    16598    passport_detail    TABLE     T  CREATE TABLE passport_detail (
    expiry_date timestamp without time zone,
    issue_date timestamp without time zone,
    name_on_passport character varying(255),
    passport_number character varying(255),
    place_issue character varying(255),
    nationality_fk bigint,
    id bigint NOT NULL,
    student_fk character varying(50)
);
 #   DROP TABLE public.passport_detail;
       public         admin    false    3                       1259    65959    passport_detail_id_seq    SEQUENCE     x   CREATE SEQUENCE passport_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.passport_detail_id_seq;
       public       admin    false    223    3            j           0    0    passport_detail_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE passport_detail_id_seq OWNED BY passport_detail.id;
            public       admin    false    286            �            1259    16606    personal_detail    TABLE     =  CREATE TABLE personal_detail (
    id bigint NOT NULL,
    date_of_birth timestamp without time zone,
    family_name character varying(255),
    first_name character varying(255),
    gender bytea,
    middle_name character varying(255),
    prefered_name character varying(255),
    title character varying(255)
);
 #   DROP TABLE public.personal_detail;
       public         admin    false    3            �            1259    16614    profile_info    TABLE     E  CREATE TABLE profile_info (
    id bigint NOT NULL,
    created character varying(255),
    facebook_url character varying(255),
    favorite_game character varying(255),
    favorite_quran_reciter character varying(255),
    linkedin_url character varying(255),
    modified character varying(255),
    student_fk bigint
);
     DROP TABLE public.profile_info;
       public         admin    false    3            �            1259    16627    reference_detail    TABLE     �  CREATE TABLE reference_detail (
    id bigint NOT NULL,
    address character varying(255),
    city character varying(255),
    country character varying(255),
    department character varying(255),
    email character varying(255),
    full_name character varying(255),
    job_title character varying(255),
    organisation character varying(255),
    postcode character varying(255),
    relationship character varying(255),
    telephone character varying(255),
    title character varying(255)
);
 $   DROP TABLE public.reference_detail;
       public         admin    false    3            �            1259    16635    student_detail    TABLE     �  CREATE TABLE student_detail (
    date_of_birth timestamp without time zone,
    title character varying(255),
    first_name character varying(50),
    last_name character varying(50),
    id bigint NOT NULL,
    gender character varying(20),
    code_ui character varying(30),
    status character varying(30),
    middle_name character varying(50),
    prefered_name character varying(50),
    family_name character varying(255)
);
 "   DROP TABLE public.student_detail;
       public         admin    false    3            �            1259    33198    student_detail_id_seq    SEQUENCE     w   CREATE SEQUENCE student_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.student_detail_id_seq;
       public       admin    false    3    227            k           0    0    student_detail_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE student_detail_id_seq OWNED BY student_detail.id;
            public       admin    false    234            �            1259    16659    student_id_seq    SEQUENCE     q   CREATE SEQUENCE student_id_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.student_id_seq;
       public       admin    false    3            �            1259    16643    syllabus    TABLE     Z   CREATE TABLE syllabus (
    id bigint NOT NULL,
    description character varying(255)
);
    DROP TABLE public.syllabus;
       public         admin    false    3                       1259    65954    upload_document    TABLE     "   CREATE TABLE upload_document (
);
 #   DROP TABLE public.upload_document;
       public         admin    false    3                        1259    65999    visa_detail    TABLE     �   CREATE TABLE visa_detail (
    id bigint NOT NULL,
    end_date character varying(255),
    start_date character varying(255),
    visa_type character varying(255),
    passport_fk bigint
);
    DROP TABLE public.visa_detail;
       public         admin    false    3            �            1259    41465    r_attendance_outcome    TABLE     a   CREATE TABLE r_attendance_outcome (
    id bigint NOT NULL,
    outcome character varying(50)
);
 -   DROP TABLE referential.r_attendance_outcome;
       referential         admin    false    9            �            1259    41463    r_attendance_outcome_id_seq    SEQUENCE     }   CREATE SEQUENCE r_attendance_outcome_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 7   DROP SEQUENCE referential.r_attendance_outcome_id_seq;
       referential       admin    false    9    255            l           0    0    r_attendance_outcome_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE r_attendance_outcome_id_seq OWNED BY r_attendance_outcome.id;
            referential       admin    false    254            !           1259    66008    r_attendance_type    TABLE     �   CREATE TABLE r_attendance_type (
    id bigint NOT NULL,
    name_ character varying(50),
    description character varying(50)
);
 *   DROP TABLE referential.r_attendance_type;
       referential         admin    false    9            "           1259    66011    r_attendance_type_id_seq    SEQUENCE     z   CREATE SEQUENCE r_attendance_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE referential.r_attendance_type_id_seq;
       referential       admin    false    289    9            m           0    0    r_attendance_type_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE r_attendance_type_id_seq OWNED BY r_attendance_type.id;
            referential       admin    false    290            �            1259    41440 
   r_category    TABLE     {   CREATE TABLE r_category (
    id bigint NOT NULL,
    name character varying(50),
    description character varying(50)
);
 #   DROP TABLE referential.r_category;
       referential         admin    false    9            �            1259    41438    r_category_id_seq    SEQUENCE     s   CREATE SEQUENCE r_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE referential.r_category_id_seq;
       referential       admin    false    247    9            n           0    0    r_category_id_seq    SEQUENCE OWNED BY     9   ALTER SEQUENCE r_category_id_seq OWNED BY r_category.id;
            referential       admin    false    246            �            1259    41447    r_class_type    TABLE     6  CREATE TABLE r_class_type (
    id bigint NOT NULL,
    name character varying(50),
    description character varying(50),
    max_weekly_classes bigint,
    exam boolean,
    minimum_attendance_percentage bigint,
    attendance_type_fk bigint,
    total_working_days bigint,
    code character varying(10)
);
 %   DROP TABLE referential.r_class_type;
       referential         admin    false    9            �            1259    41445    r_class_type_id_seq    SEQUENCE     u   CREATE SEQUENCE r_class_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE referential.r_class_type_id_seq;
       referential       admin    false    249    9            o           0    0    r_class_type_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE r_class_type_id_seq OWNED BY r_class_type.id;
            referential       admin    false    248            
           1259    41499    r_contact_person_type    TABLE     d   CREATE TABLE r_contact_person_type (
    id bigint NOT NULL,
    type_name character varying(50)
);
 .   DROP TABLE referential.r_contact_person_type;
       referential         admin    false    9            	           1259    41497    r_contact_person_type_id_seq    SEQUENCE     ~   CREATE SEQUENCE r_contact_person_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE referential.r_contact_person_type_id_seq;
       referential       admin    false    9    266            p           0    0    r_contact_person_type_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE r_contact_person_type_id_seq OWNED BY r_contact_person_type.id;
            referential       admin    false    265            �            1259    41359 	   r_country    TABLE       CREATE TABLE r_country (
    iso character(2) NOT NULL,
    name_ character varying(80) NOT NULL,
    nicename character varying(80) NOT NULL,
    iso3 character(3) DEFAULT NULL::bpchar,
    numcode bigint,
    phonecode bigint NOT NULL,
    id bigint NOT NULL
);
 "   DROP TABLE referential.r_country;
       referential         admin    false    9                       1259    41562    r_country_id_seq    SEQUENCE     r   CREATE SEQUENCE r_country_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE referential.r_country_id_seq;
       referential       admin    false    236    9            q           0    0    r_country_id_seq    SEQUENCE OWNED BY     7   ALTER SEQUENCE r_country_id_seq OWNED BY r_country.id;
            referential       admin    false    272            9           1259    115086    r_department    TABLE     �   CREATE TABLE r_department (
    id bigint NOT NULL,
    code character varying(50),
    department character varying(50),
    description character varying(50)
);
 %   DROP TABLE referential.r_department;
       referential         admin    false    9            8           1259    115084    r_department_id_seq    SEQUENCE     u   CREATE SEQUENCE r_department_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE referential.r_department_id_seq;
       referential       admin    false    9    313            r           0    0    r_department_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE r_department_id_seq OWNED BY r_department.id;
            referential       admin    false    312            :           1259    115090    r_designation    TABLE     �   CREATE TABLE r_designation (
    id bigint NOT NULL,
    code character varying(50),
    designation character varying(50),
    description character varying(50)
);
 &   DROP TABLE referential.r_designation;
       referential         admin    false    9            s           0    0    TABLE r_designation    COMMENT     �   COMMENT ON TABLE r_designation IS 'This table hold information about each and every type of human resources in the institution

Note: Not to mix with the table r_user_type';
            referential       admin    false    314            ;           1259    115095    r_designation_id_seq    SEQUENCE     v   CREATE SEQUENCE r_designation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE referential.r_designation_id_seq;
       referential       admin    false    314    9            t           0    0    r_designation_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE r_designation_id_seq OWNED BY r_designation.id;
            referential       admin    false    315            �            1259    41459    r_drop_attendance_reason    TABLE     d   CREATE TABLE r_drop_attendance_reason (
    id bigint NOT NULL,
    reason character varying(50)
);
 1   DROP TABLE referential.r_drop_attendance_reason;
       referential         admin    false    9            �            1259    41457    r_drop_attendance_reason_id_seq    SEQUENCE     �   CREATE SEQUENCE r_drop_attendance_reason_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ;   DROP SEQUENCE referential.r_drop_attendance_reason_id_seq;
       referential       admin    false    253    9            u           0    0    r_drop_attendance_reason_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE r_drop_attendance_reason_id_seq OWNED BY r_drop_attendance_reason.id;
            referential       admin    false    252                       1259    41478    r_drop_teach_reason    TABLE     _   CREATE TABLE r_drop_teach_reason (
    id bigint NOT NULL,
    reason character varying(50)
);
 ,   DROP TABLE referential.r_drop_teach_reason;
       referential         admin    false    9                       1259    41476    r_drop_teach_reason_id_seq    SEQUENCE     |   CREATE SEQUENCE r_drop_teach_reason_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE referential.r_drop_teach_reason_id_seq;
       referential       admin    false    259    9            v           0    0    r_drop_teach_reason_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE r_drop_teach_reason_id_seq OWNED BY r_drop_teach_reason.id;
            referential       admin    false    258            @           1259    131470    r_event_type    TABLE     \   CREATE TABLE r_event_type (
    id bigint NOT NULL,
    event_type character varying(50)
);
 %   DROP TABLE referential.r_event_type;
       referential         admin    false    9            ?           1259    131468    r_event_type_id_seq    SEQUENCE     u   CREATE SEQUENCE r_event_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE referential.r_event_type_id_seq;
       referential       admin    false    320    9            w           0    0    r_event_type_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE r_event_type_id_seq OWNED BY r_event_type.id;
            referential       admin    false    319            �            1259    41407    r_fee    TABLE     �   CREATE TABLE r_fee (
    id bigint NOT NULL,
    fee_type character varying(15),
    fees numeric,
    code character varying(10)
);
    DROP TABLE referential.r_fee;
       referential         admin    false    9            �            1259    41405    r_fee_id_seq    SEQUENCE     n   CREATE SEQUENCE r_fee_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE referential.r_fee_id_seq;
       referential       admin    false    239    9            x           0    0    r_fee_id_seq    SEQUENCE OWNED BY     /   ALTER SEQUENCE r_fee_id_seq OWNED BY r_fee.id;
            referential       admin    false    238                       1259    57749    r_level    TABLE     y   CREATE TABLE r_level (
    id bigint NOT NULL,
    level character varying(25),
    description character varying(30)
);
     DROP TABLE referential.r_level;
       referential         admin    false    9                       1259    57752    r_level_id_seq    SEQUENCE     p   CREATE SEQUENCE r_level_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE referential.r_level_id_seq;
       referential       admin    false    279    9            y           0    0    r_level_id_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE r_level_id_seq OWNED BY r_level.id;
            referential       admin    false    280            )           1259    74131    r_month    TABLE     K   CREATE TABLE r_month (
    id bigint NOT NULL,
    month_ character(10)
);
     DROP TABLE referential.r_month;
       referential         admin    false    9            (           1259    74129    r_month_id_seq    SEQUENCE     p   CREATE SEQUENCE r_month_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE referential.r_month_id_seq;
       referential       admin    false    9    297            z           0    0    r_month_id_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE r_month_id_seq OWNED BY r_month.id;
            referential       admin    false    296                       1259    41572    r_profil    TABLE     .  CREATE TABLE r_profil (
    id bigint NOT NULL,
    code character varying(2) NOT NULL,
    name_ character varying(50) NOT NULL,
    when_delete timestamp without time zone,
    when_done timestamp without time zone,
    when_update timestamp without time zone,
    who_done character varying(255)
);
 !   DROP TABLE referential.r_profil;
       referential         admin    false    9                       1259    41570    r_profil_id_seq    SEQUENCE     q   CREATE SEQUENCE r_profil_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE referential.r_profil_id_seq;
       referential       admin    false    274    9            {           0    0    r_profil_id_seq    SEQUENCE OWNED BY     5   ALTER SEQUENCE r_profil_id_seq OWNED BY r_profil.id;
            referential       admin    false    273            +           1259    74137    r_status    TABLE     L   CREATE TABLE r_status (
    id bigint NOT NULL,
    status character(20)
);
 !   DROP TABLE referential.r_status;
       referential         admin    false    9            *           1259    74135    r_status_id_seq    SEQUENCE     q   CREATE SEQUENCE r_status_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE referential.r_status_id_seq;
       referential       admin    false    299    9            |           0    0    r_status_id_seq    SEQUENCE OWNED BY     5   ALTER SEQUENCE r_status_id_seq OWNED BY r_status.id;
            referential       admin    false    298            $           1259    66027 
   r_syllabus    TABLE     |   CREATE TABLE r_syllabus (
    id bigint NOT NULL,
    name_ character varying(50),
    description character varying(50)
);
 #   DROP TABLE referential.r_syllabus;
       referential         admin    false    9            }           0    0    COLUMN r_syllabus.id    COMMENT     (   COMMENT ON COLUMN r_syllabus.id IS '
';
            referential       admin    false    292            #           1259    66025    r_syllabus_name_id_seq    SEQUENCE     x   CREATE SEQUENCE r_syllabus_name_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE referential.r_syllabus_name_id_seq;
       referential       admin    false    292    9            ~           0    0    r_syllabus_name_id_seq    SEQUENCE OWNED BY     >   ALTER SEQUENCE r_syllabus_name_id_seq OWNED BY r_syllabus.id;
            referential       admin    false    291                       1259    41484    r_teach_outcome    TABLE     \   CREATE TABLE r_teach_outcome (
    id bigint NOT NULL,
    outcome character varying(50)
);
 (   DROP TABLE referential.r_teach_outcome;
       referential         admin    false    9                       1259    41482    r_teach_outcome_id_seq    SEQUENCE     x   CREATE SEQUENCE r_teach_outcome_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE referential.r_teach_outcome_id_seq;
       referential       admin    false    261    9                       0    0    r_teach_outcome_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE r_teach_outcome_id_seq OWNED BY r_teach_outcome.id;
            referential       admin    false    260                       1259    41578    r_user_type    TABLE     �   CREATE TABLE r_user_type (
    id bigint NOT NULL,
    code character varying(20),
    user_type character varying(50),
    description character varying(50)
);
 $   DROP TABLE referential.r_user_type;
       referential         admin    false    9                       1259    57738    r_user_id_seq    SEQUENCE     o   CREATE SEQUENCE r_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE referential.r_user_id_seq;
       referential       admin    false    275    9            �           0    0    r_user_id_seq    SEQUENCE OWNED BY     6   ALTER SEQUENCE r_user_id_seq OWNED BY r_user_type.id;
            referential       admin    false    278            '           1259    74125    r_year    TABLE     P   CREATE TABLE r_year (
    id bigint NOT NULL,
    year_ character varying(4)
);
    DROP TABLE referential.r_year;
       referential         admin    false    9            &           1259    74123    r_year_id_seq    SEQUENCE     o   CREATE SEQUENCE r_year_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE referential.r_year_id_seq;
       referential       admin    false    9    295            �           0    0    r_year_id_seq    SEQUENCE OWNED BY     1   ALTER SEQUENCE r_year_id_seq OWNED BY r_year.id;
            referential       admin    false    294            �	           2604    106892    academic_year id    DEFAULT     h   ALTER TABLE ONLY academic_year ALTER COLUMN id SET DEFAULT nextval('r_academic_year_id_seq'::regclass);
 F   ALTER TABLE administrator.academic_year ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    307    306    307            �	           2604    106877    application_user id    DEFAULT     l   ALTER TABLE ONLY application_user ALTER COLUMN id SET DEFAULT nextval('application_user_id_seq'::regclass);
 I   ALTER TABLE administrator.application_user ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    304    305    305            �	           2604    49533    attendance id    DEFAULT     `   ALTER TABLE ONLY attendance ALTER COLUMN id SET DEFAULT nextval('attendance_id_seq'::regclass);
 C   ALTER TABLE administrator.attendance ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    277    276    277            �	           2604    41456    class_schedule id    DEFAULT     h   ALTER TABLE ONLY class_schedule ALTER COLUMN id SET DEFAULT nextval('class_schedule_id_seq'::regclass);
 G   ALTER TABLE administrator.class_schedule ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    251    250    251            �	           2604    41508    contact_person_student id    DEFAULT     x   ALTER TABLE ONLY contact_person_student ALTER COLUMN id SET DEFAULT nextval('contact_person_student_id_seq'::regclass);
 O   ALTER TABLE administrator.contact_person_student ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    267    268    268            �	           2604    41428    fee_student id    DEFAULT     b   ALTER TABLE ONLY fee_student ALTER COLUMN id SET DEFAULT nextval('fee_student_id_seq'::regclass);
 D   ALTER TABLE administrator.fee_student ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    242    243    243            �	           2604    41419    fees id    DEFAULT     T   ALTER TABLE ONLY fees ALTER COLUMN id SET DEFAULT nextval('fees_id_seq'::regclass);
 =   ALTER TABLE administrator.fees ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    241    240    241            �	           2604    41544    instructor_presence id    DEFAULT     r   ALTER TABLE ONLY instructor_presence ALTER COLUMN id SET DEFAULT nextval('instructor_presence_id_seq'::regclass);
 L   ALTER TABLE administrator.instructor_presence ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    270    263            �	           2604    115081 
   journee id    DEFAULT     Z   ALTER TABLE ONLY journee ALTER COLUMN id SET DEFAULT nextval('journee_id_seq'::regclass);
 @   ALTER TABLE administrator.journee ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    311    310    311            �	           2604    123314    log_info id    DEFAULT     \   ALTER TABLE ONLY log_info ALTER COLUMN id SET DEFAULT nextval('log_info_id_seq'::regclass);
 A   ALTER TABLE administrator.log_info ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    318    317            �	           2604    115071    ro_users id    DEFAULT     c   ALTER TABLE ONLY ro_users ALTER COLUMN id SET DEFAULT nextval('ro_utilisateurs_id_seq'::regclass);
 A   ALTER TABLE administrator.ro_users ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    309    308    309            �	           2604    41552    student_presence id    DEFAULT     l   ALTER TABLE ONLY student_presence ALTER COLUMN id SET DEFAULT nextval('student_presence_id_seq'::regclass);
 I   ALTER TABLE administrator.student_presence ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    271    262            �	           2604    41475    teach id    DEFAULT     V   ALTER TABLE ONLY teach ALTER COLUMN id SET DEFAULT nextval('teach_id_seq'::regclass);
 >   ALTER TABLE administrator.teach ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    257    256    257            �	           2604    41437    transaction id    DEFAULT     b   ALTER TABLE ONLY transaction ALTER COLUMN id SET DEFAULT nextval('transaction_id_seq'::regclass);
 D   ALTER TABLE administrator.transaction ALTER COLUMN id DROP DEFAULT;
       administrator       admin    false    244    245    245            �	           2604    16780    about_institution id    DEFAULT     n   ALTER TABLE ONLY about_institution ALTER COLUMN id SET DEFAULT nextval('about_institution_id_seq'::regclass);
 C   ALTER TABLE public.about_institution ALTER COLUMN id DROP DEFAULT;
       public       admin    false    231    198            �	           2604    65916    additional_info id    DEFAULT     j   ALTER TABLE ONLY additional_info ALTER COLUMN id SET DEFAULT nextval('additional_info_id_seq'::regclass);
 A   ALTER TABLE public.additional_info ALTER COLUMN id DROP DEFAULT;
       public       admin    false    281    201            �	           2604    41338    address_detail id    DEFAULT     h   ALTER TABLE ONLY address_detail ALTER COLUMN id SET DEFAULT nextval('address_detail_id_seq'::regclass);
 @   ALTER TABLE public.address_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    235    202            �	           2604    123278    application_detail id    DEFAULT     p   ALTER TABLE ONLY application_detail ALTER COLUMN id SET DEFAULT nextval('application_detail_id_seq'::regclass);
 D   ALTER TABLE public.application_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    316    204            �	           2604    98685    assign_subject id    DEFAULT     h   ALTER TABLE ONLY assign_subject ALTER COLUMN id SET DEFAULT nextval('assign_subject_id_seq'::regclass);
 @   ALTER TABLE public.assign_subject ALTER COLUMN id DROP DEFAULT;
       public       admin    false    303    302    303            �	           2604    90493    assignment id    DEFAULT     `   ALTER TABLE ONLY assignment ALTER COLUMN id SET DEFAULT nextval('assignment_id_seq'::regclass);
 <   ALTER TABLE public.assignment ALTER COLUMN id DROP DEFAULT;
       public       admin    false    300    301    301            �	           2604    74106    batch id    DEFAULT     V   ALTER TABLE ONLY batch ALTER COLUMN id SET DEFAULT nextval('batch_id_seq'::regclass);
 7   ALTER TABLE public.batch ALTER COLUMN id DROP DEFAULT;
       public       admin    false    293    206            �	           2604    33146 	   classe id    DEFAULT     X   ALTER TABLE ONLY classe ALTER COLUMN id SET DEFAULT nextval('classe_id_seq'::regclass);
 8   ALTER TABLE public.classe ALTER COLUMN id DROP DEFAULT;
       public       admin    false    233    207            �	           2604    41367    contact_detail id    DEFAULT     h   ALTER TABLE ONLY contact_detail ALTER COLUMN id SET DEFAULT nextval('contact_detail_id_seq'::regclass);
 @   ALTER TABLE public.contact_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    237    208            �	           2604    24960 	   course id    DEFAULT     X   ALTER TABLE ONLY course ALTER COLUMN id SET DEFAULT nextval('course_id_seq'::regclass);
 8   ALTER TABLE public.course ALTER COLUMN id DROP DEFAULT;
       public       admin    false    232    209            �	           2604    65930    educational_detail id    DEFAULT     p   ALTER TABLE ONLY educational_detail ALTER COLUMN id SET DEFAULT nextval('educational_detail_id_seq'::regclass);
 D   ALTER TABLE public.educational_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    282    283    283            �	           2604    41511    emergency_contact id    DEFAULT     n   ALTER TABLE ONLY emergency_contact ALTER COLUMN id SET DEFAULT nextval('emergency_contact_id_seq'::regclass);
 C   ALTER TABLE public.emergency_contact ALTER COLUMN id DROP DEFAULT;
       public       admin    false    269    264            �	           2604    65950    nationality_detail id    DEFAULT     p   ALTER TABLE ONLY nationality_detail ALTER COLUMN id SET DEFAULT nextval('nationality_detail_id_seq'::regclass);
 D   ALTER TABLE public.nationality_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    284    220            �	           2604    65961    passport_detail id    DEFAULT     j   ALTER TABLE ONLY passport_detail ALTER COLUMN id SET DEFAULT nextval('passport_detail_id_seq'::regclass);
 A   ALTER TABLE public.passport_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    286    223            �	           2604    33200    student_detail id    DEFAULT     h   ALTER TABLE ONLY student_detail ALTER COLUMN id SET DEFAULT nextval('student_detail_id_seq'::regclass);
 @   ALTER TABLE public.student_detail ALTER COLUMN id DROP DEFAULT;
       public       admin    false    234    227            �	           2604    41468    r_attendance_outcome id    DEFAULT     t   ALTER TABLE ONLY r_attendance_outcome ALTER COLUMN id SET DEFAULT nextval('r_attendance_outcome_id_seq'::regclass);
 K   ALTER TABLE referential.r_attendance_outcome ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    255    254    255            �	           2604    66013    r_attendance_type id    DEFAULT     n   ALTER TABLE ONLY r_attendance_type ALTER COLUMN id SET DEFAULT nextval('r_attendance_type_id_seq'::regclass);
 H   ALTER TABLE referential.r_attendance_type ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    290    289            �	           2604    41443    r_category id    DEFAULT     `   ALTER TABLE ONLY r_category ALTER COLUMN id SET DEFAULT nextval('r_category_id_seq'::regclass);
 A   ALTER TABLE referential.r_category ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    247    246    247            �	           2604    41450    r_class_type id    DEFAULT     d   ALTER TABLE ONLY r_class_type ALTER COLUMN id SET DEFAULT nextval('r_class_type_id_seq'::regclass);
 C   ALTER TABLE referential.r_class_type ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    249    248    249            �	           2604    41502    r_contact_person_type id    DEFAULT     v   ALTER TABLE ONLY r_contact_person_type ALTER COLUMN id SET DEFAULT nextval('r_contact_person_type_id_seq'::regclass);
 L   ALTER TABLE referential.r_contact_person_type ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    265    266    266            �	           2604    41564    r_country id    DEFAULT     ^   ALTER TABLE ONLY r_country ALTER COLUMN id SET DEFAULT nextval('r_country_id_seq'::regclass);
 @   ALTER TABLE referential.r_country ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    272    236            �	           2604    115089    r_department id    DEFAULT     d   ALTER TABLE ONLY r_department ALTER COLUMN id SET DEFAULT nextval('r_department_id_seq'::regclass);
 C   ALTER TABLE referential.r_department ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    313    312    313            �	           2604    115097    r_designation id    DEFAULT     f   ALTER TABLE ONLY r_designation ALTER COLUMN id SET DEFAULT nextval('r_designation_id_seq'::regclass);
 D   ALTER TABLE referential.r_designation ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    315    314            �	           2604    41462    r_drop_attendance_reason id    DEFAULT     |   ALTER TABLE ONLY r_drop_attendance_reason ALTER COLUMN id SET DEFAULT nextval('r_drop_attendance_reason_id_seq'::regclass);
 O   ALTER TABLE referential.r_drop_attendance_reason ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    252    253    253            �	           2604    41481    r_drop_teach_reason id    DEFAULT     r   ALTER TABLE ONLY r_drop_teach_reason ALTER COLUMN id SET DEFAULT nextval('r_drop_teach_reason_id_seq'::regclass);
 J   ALTER TABLE referential.r_drop_teach_reason ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    258    259    259            �	           2604    131473    r_event_type id    DEFAULT     d   ALTER TABLE ONLY r_event_type ALTER COLUMN id SET DEFAULT nextval('r_event_type_id_seq'::regclass);
 C   ALTER TABLE referential.r_event_type ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    320    319    320            �	           2604    41410    r_fee id    DEFAULT     V   ALTER TABLE ONLY r_fee ALTER COLUMN id SET DEFAULT nextval('r_fee_id_seq'::regclass);
 <   ALTER TABLE referential.r_fee ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    239    238    239            �	           2604    57754 
   r_level id    DEFAULT     Z   ALTER TABLE ONLY r_level ALTER COLUMN id SET DEFAULT nextval('r_level_id_seq'::regclass);
 >   ALTER TABLE referential.r_level ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    280    279            �	           2604    74134 
   r_month id    DEFAULT     Z   ALTER TABLE ONLY r_month ALTER COLUMN id SET DEFAULT nextval('r_month_id_seq'::regclass);
 >   ALTER TABLE referential.r_month ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    297    296    297            �	           2604    41575    r_profil id    DEFAULT     \   ALTER TABLE ONLY r_profil ALTER COLUMN id SET DEFAULT nextval('r_profil_id_seq'::regclass);
 ?   ALTER TABLE referential.r_profil ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    274    273    274            �	           2604    74140    r_status id    DEFAULT     \   ALTER TABLE ONLY r_status ALTER COLUMN id SET DEFAULT nextval('r_status_id_seq'::regclass);
 ?   ALTER TABLE referential.r_status ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    299    298    299            �	           2604    66030    r_syllabus id    DEFAULT     e   ALTER TABLE ONLY r_syllabus ALTER COLUMN id SET DEFAULT nextval('r_syllabus_name_id_seq'::regclass);
 A   ALTER TABLE referential.r_syllabus ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    292    291    292            �	           2604    41487    r_teach_outcome id    DEFAULT     j   ALTER TABLE ONLY r_teach_outcome ALTER COLUMN id SET DEFAULT nextval('r_teach_outcome_id_seq'::regclass);
 F   ALTER TABLE referential.r_teach_outcome ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    261    260    261            �	           2604    57740    r_user_type id    DEFAULT     ]   ALTER TABLE ONLY r_user_type ALTER COLUMN id SET DEFAULT nextval('r_user_id_seq'::regclass);
 B   ALTER TABLE referential.r_user_type ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    278    275            �	           2604    74128 	   r_year id    DEFAULT     X   ALTER TABLE ONLY r_year ALTER COLUMN id SET DEFAULT nextval('r_year_id_seq'::regclass);
 =   ALTER TABLE referential.r_year ALTER COLUMN id DROP DEFAULT;
       referential       admin    false    294    295    295            8          0    106889    academic_year 
   TABLE DATA               i   COPY academic_year (id, status_fk, end_month_fk, start_month_fk, end_year_fk, start_year_fk) FROM stdin;
    administrator       admin    false    307   r�      6          0    106874    application_user 
   TABLE DATA               k   COPY application_user (id, name, email, password, is_active, meta_data, last_update, is_admin) FROM stdin;
    administrator       admin    false    305   ��                0    49530 
   attendance 
   TABLE DATA               �   COPY attendance (id, student_fk, class_fk, class_enrollment_date, class_drop_date, drop_class_reason_fk, attendance_outcome_fk) FROM stdin;
    administrator       admin    false    277   ��                 0    41453    class_schedule 
   TABLE DATA               E   COPY class_schedule (id, class_fk, start_time, end_time) FROM stdin;
    administrator       admin    false    251   �                0    41505    contact_person_student 
   TABLE DATA               d   COPY contact_person_student (id, contact_person_fk, student_fk, contact_person_type_fk) FROM stdin;
    administrator       admin    false    268   !�      �
          0    41425    fee_student 
   TABLE DATA               {   COPY fee_student (id, fee_fk, student_fk, effective_from, amount, discount_fk, status_fk, due_date, last_date) FROM stdin;
    administrator       admin    false    243   >�      �
          0    41416    fees 
   TABLE DATA               M   COPY fees (id, fee_heading, amount, class_fk, fee_type_fk, code) FROM stdin;
    administrator       admin    false    241   g�                0    41491    instructor_presence 
   TABLE DATA               m   COPY instructor_presence (instructor_fk, class_schedule_fk, present, dates, additional_info, id) FROM stdin;
    administrator       admin    false    263   ��      <          0    115078    journee 
   TABLE DATA               A   COPY journee (id, journee, etat, owner, last_update) FROM stdin;
    administrator       admin    false    311   ��      B          0    123309    log_info 
   TABLE DATA               <   COPY log_info (id, log_name, code, description) FROM stdin;
    administrator       admin    false    317   $�      :          0    115068    ro_users 
   TABLE DATA               �   COPY ro_users (id, "user", user_type, comptable, service, user_name, date_created, disable_date, disabled, granted_process, granted_numbering) FROM stdin;
    administrator       admin    false    309   ��                0    41488    student_presence 
   TABLE DATA               g   COPY student_presence (student_fk, class_schedule_fk, present, dates, additional_info, id) FROM stdin;
    administrator       admin    false    262   ��                0    41472    teach 
   TABLE DATA               s   COPY teach (id, instructor_fk, class_fk, start_date, end_date, drop_teach_reason_fk, teach_outcome_fk) FROM stdin;
    administrator       admin    false    257   ��      �
          0    41434    transaction 
   TABLE DATA               T   COPY transaction (id, fee_fk, student_fk, amount, description, remarks) FROM stdin;
    administrator       admin    false    245   �      �
          0    16386    about_institution 
   TABLE DATA               �   COPY about_institution (institution_name, address, city, code, description, email, postcode, region, website, id, owner_fname, owner_lname, business_category, country_fk, phone_no, year_established, campus) FROM stdin;
    public       admin    false    198   3�      �
          0    16394    academic_qualification 
   TABLE DATA               �   COPY academic_qualification (id, country, date_of_award, end_date, institution_name, other_achievement, title_of_qualification, result, start_date, subject) FROM stdin;
    public       admin    false    199   ��      �
          0    16402    account_profile 
   TABLE DATA               a   COPY account_profile (id, code, name, when_delete, when_done, when_update, who_done) FROM stdin;
    public       admin    false    200   ��      �
          0    16410    additional_info 
   TABLE DATA               �   COPY additional_info (id, student_fk, disability_fk, ethnicity_fk, mother_tongue_fk, religion_fk, criminal_conviction, bring_partner, disability, ethnicity) FROM stdin;
    public       admin    false    201   �      �
          0    16418    address_detail 
   TABLE DATA               �   COPY address_detail (city, postcode, address, region, id, student_fk, permanent_address, primary_number, home_number, email, country_fk, country, present_address, valid_until) FROM stdin;
    public       admin    false    202   <�      �
          0    16426    annoucement 
   TABLE DATA               2   COPY annoucement (id, message, title) FROM stdin;
    public       admin    false    203   ��      �
          0    16439    application_detail 
   TABLE DATA               �   COPY application_detail (admission_officer, code, course_fk, faculty, finish_date, location_, mode_of_attendance, start_date, status, batch_fk, id, academic_year) FROM stdin;
    public       admin    false    204   ��      4          0    98682    assign_subject 
   TABLE DATA               F   COPY assign_subject (id, course_fk, batch_fk, subject_fk) FROM stdin;
    public       admin    false    303   !�      2          0    90490 
   assignment 
   TABLE DATA               g   COPY assignment (id, title, description, course_fk, batch_fk, subject_fk, date_submission) FROM stdin;
    public       admin    false    301   R�      �
          0    16447    bank_account 
   TABLE DATA               J   COPY bank_account (id, account_number, sort_code, student_id) FROM stdin;
    public       admin    false    205   o�      �
          0    16452    batch 
   TABLE DATA               a   COPY batch (batch_name, end_date, max_student, start_date, course_fk, id, course_id) FROM stdin;
    public       admin    false    206   ��      �
          0    16457    classe 
   TABLE DATA               �   COPY classe (id, name_, class_type_fk, level_fk, description, start_date, end_date, completed, student_number, class_number, student_no, lecturer_fk, module_fk) FROM stdin;
    public       admin    false    207   ��      �
          0    16462    contact_detail 
   TABLE DATA               �   COPY contact_detail (email, ermergency_address, ermergency_name, ermergency_relation, ermergency_number, primary_phoneno, secondary_phoneno, skype_address, student_fk, id) FROM stdin;
    public       admin    false    208   ��      �
          0    16470    course 
   TABLE DATA               �   COPY course (code, department, title, status, id, description, syllabus_fk, attendance_type_fk, min_attendance_percentage, total_working_days, academic_year, faculty, location, mode_of_attendance, start_date, tutor, year_of_study) FROM stdin;
    public       admin    false    209   3�      �
          0    16478 
   department 
   TABLE DATA               B   COPY department (id, code, description, name, status) FROM stdin;
    public       admin    false    210   ��      �
          0    16486    dw_dimensions 
   TABLE DATA               K   COPY dw_dimensions (id, iid, champ, entite, typechamp, valeur) FROM stdin;
    public       admin    false    211   ��                 0    65927    educational_detail 
   TABLE DATA               �   COPY educational_detail (id, institution_name, qualification_fk, subject_fk, date_qualification_started, date_qualification_ended, final_grade, completed, student_fk) FROM stdin;
    public       admin    false    283   ��                0    41494    emergency_contact 
   TABLE DATA               l   COPY emergency_contact (phone, mobile, email, id, full_name, address, relationship, student_fk) FROM stdin;
    public       admin    false    264   �      $          0    65983    equality_data 
   TABLE DATA               �   COPY equality_data (id, country_birth, ethnic_origin, learning_disabilities, occupation, original_gender, religion, sexual_orientation, socio_economic_classification) FROM stdin;
    public       admin    false    287   G�      �
          0    16502    event 
   TABLE DATA               F   COPY event (id, description, end_date, start_date, title) FROM stdin;
    public       admin    false    212   d�      �
          0    16510 
   experience 
   TABLE DATA               �   COPY experience (id, city, country, employer_address, employer_name, end_date, job_title, responsibilities, start_date) FROM stdin;
    public       admin    false    213   ��      �
          0    16518    finance 
   TABLE DATA               G   COPY finance (id, account_name, account_number, sort_code) FROM stdin;
    public       admin    false    214   ��      �
          0    16534    information_statistic 
   TABLE DATA               Y   COPY information_statistic (id, about_us, other_about_us, other_application) FROM stdin;
    public       admin    false    215   ��      �
          0    16542    institution 
   TABLE DATA               �   COPY institution (id, created, industry, address, city, code, country, currency, email, fax, language, logo, mobile, name, phone, postcode, region, timezone, website, status) FROM stdin;
    public       admin    false    216   ��      �
          0    16550    institutionregistration 
   TABLE DATA                 COPY institutionregistration (id, abn, address, business_email, business_name, business_phone, business_size, business_website, city, country, created, current_advertisement, email, fax, first_name, industry, last_name, phone, postcode, state, status) FROM stdin;
    public       admin    false    217   	�      �
          0    16558    lecturer 
   TABLE DATA               �   COPY lecturer (id, birth_date, last_name, first_name, gender, middle_name, prefered_name, title, date_of_birth, family_name) FROM stdin;
    public       admin    false    218   &�      �
          0    16566    module 
   TABLE DATA               E   COPY module (id, code, description, period, title, year) FROM stdin;
    public       admin    false    219   C�      �
          0    16574    nationality_detail 
   TABLE DATA               �   COPY nationality_detail (id, nationality_fk, permanent_residence_fk, residential_status_fk, student_fk, passport_no, issue_date, expiry_date, issue_place, name_on_passport, identification_type_fk) FROM stdin;
    public       admin    false    220   `�      �
          0    16582    note 
   TABLE DATA               S   COPY note (id, batch, course, attachment, description, title, subject) FROM stdin;
    public       admin    false    221   ��      �
          0    16590    parent_info 
   TABLE DATA               h   COPY parent_info (id, date_of_birth, first_name, gender, last_name, other_info, student_fk) FROM stdin;
    public       admin    false    222   ��      �
          0    16598    passport_detail 
   TABLE DATA               �   COPY passport_detail (expiry_date, issue_date, name_on_passport, passport_number, place_issue, nationality_fk, id, student_fk) FROM stdin;
    public       admin    false    223   ��      �
          0    16606    personal_detail 
   TABLE DATA               y   COPY personal_detail (id, date_of_birth, family_name, first_name, gender, middle_name, prefered_name, title) FROM stdin;
    public       admin    false    224   ��      �
          0    16614    profile_info 
   TABLE DATA               �   COPY profile_info (id, created, facebook_url, favorite_game, favorite_quran_reciter, linkedin_url, modified, student_fk) FROM stdin;
    public       admin    false    225   	       �
          0    16627    reference_detail 
   TABLE DATA               �   COPY reference_detail (id, address, city, country, department, email, full_name, job_title, organisation, postcode, relationship, telephone, title) FROM stdin;
    public       admin    false    226   &       �
          0    16635    student_detail 
   TABLE DATA               �   COPY student_detail (date_of_birth, title, first_name, last_name, id, gender, code_ui, status, middle_name, prefered_name, family_name) FROM stdin;
    public       admin    false    227   C       �
          0    16643    syllabus 
   TABLE DATA               ,   COPY syllabus (id, description) FROM stdin;
    public       admin    false    228   �       "          0    65954    upload_document 
   TABLE DATA               "   COPY upload_document  FROM stdin;
    public       admin    false    285   �       %          0    65999    visa_detail 
   TABLE DATA               P   COPY visa_detail (id, end_date, start_date, visa_type, passport_fk) FROM stdin;
    public       admin    false    288   �                 0    41465    r_attendance_outcome 
   TABLE DATA               4   COPY r_attendance_outcome (id, outcome) FROM stdin;
    referential       admin    false    255   �       &          0    66008    r_attendance_type 
   TABLE DATA               <   COPY r_attendance_type (id, name_, description) FROM stdin;
    referential       admin    false    289         �
          0    41440 
   r_category 
   TABLE DATA               4   COPY r_category (id, name, description) FROM stdin;
    referential       admin    false    247   6      �
          0    41447    r_class_type 
   TABLE DATA               �   COPY r_class_type (id, name, description, max_weekly_classes, exam, minimum_attendance_percentage, attendance_type_fk, total_working_days, code) FROM stdin;
    referential       admin    false    249   [                0    41499    r_contact_person_type 
   TABLE DATA               7   COPY r_contact_person_type (id, type_name) FROM stdin;
    referential       admin    false    266   �      �
          0    41359 	   r_country 
   TABLE DATA               P   COPY r_country (iso, name_, nicename, iso3, numcode, phonecode, id) FROM stdin;
    referential       admin    false    236   �      >          0    115086    r_department 
   TABLE DATA               B   COPY r_department (id, code, department, description) FROM stdin;
    referential       admin    false    313         ?          0    115090    r_designation 
   TABLE DATA               D   COPY r_designation (id, code, designation, description) FROM stdin;
    referential       admin    false    314   4                0    41459    r_drop_attendance_reason 
   TABLE DATA               7   COPY r_drop_attendance_reason (id, reason) FROM stdin;
    referential       admin    false    253   Q                0    41478    r_drop_teach_reason 
   TABLE DATA               2   COPY r_drop_teach_reason (id, reason) FROM stdin;
    referential       admin    false    259   n      E          0    131470    r_event_type 
   TABLE DATA               /   COPY r_event_type (id, event_type) FROM stdin;
    referential       admin    false    320   �      �
          0    41407    r_fee 
   TABLE DATA               2   COPY r_fee (id, fee_type, fees, code) FROM stdin;
    referential       admin    false    239   �                0    57749    r_level 
   TABLE DATA               2   COPY r_level (id, level, description) FROM stdin;
    referential       admin    false    279   �      .          0    74131    r_month 
   TABLE DATA               &   COPY r_month (id, month_) FROM stdin;
    referential       admin    false    297   "                0    41572    r_profil 
   TABLE DATA               [   COPY r_profil (id, code, name_, when_delete, when_done, when_update, who_done) FROM stdin;
    referential       admin    false    274   �      0          0    74137    r_status 
   TABLE DATA               '   COPY r_status (id, status) FROM stdin;
    referential       admin    false    299   �      )          0    66027 
   r_syllabus 
   TABLE DATA               5   COPY r_syllabus (id, name_, description) FROM stdin;
    referential       admin    false    292   �      
          0    41484    r_teach_outcome 
   TABLE DATA               /   COPY r_teach_outcome (id, outcome) FROM stdin;
    referential       admin    false    261   /                0    41578    r_user_type 
   TABLE DATA               @   COPY r_user_type (id, code, user_type, description) FROM stdin;
    referential       admin    false    275   L      ,          0    74125    r_year 
   TABLE DATA               $   COPY r_year (id, year_) FROM stdin;
    referential       admin    false    295   i      �           0    0    application_user_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('application_user_id_seq', 1, true);
            administrator       admin    false    304            �           0    0    attendance_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('attendance_id_seq', 1, false);
            administrator       admin    false    276            �           0    0    class_schedule_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('class_schedule_id_seq', 1, false);
            administrator       admin    false    250            �           0    0    contact_person_student_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('contact_person_student_id_seq', 1, false);
            administrator       admin    false    267            �           0    0    fee_student_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('fee_student_id_seq', 2, true);
            administrator       admin    false    242            �           0    0    fees_id_seq    SEQUENCE SET     3   SELECT pg_catalog.setval('fees_id_seq', 1, false);
            administrator       admin    false    240            �           0    0    instructor_presence_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('instructor_presence_id_seq', 1, false);
            administrator       admin    false    270            �           0    0    journee_id_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('journee_id_seq', 5, true);
            administrator       admin    false    310            �           0    0    log_info_id_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('log_info_id_seq', 13, true);
            administrator       admin    false    318            �           0    0    r_academic_year_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('r_academic_year_id_seq', 1, true);
            administrator       admin    false    306            �           0    0    ro_utilisateurs_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('ro_utilisateurs_id_seq', 1, true);
            administrator       admin    false    308            �           0    0    student_presence_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('student_presence_id_seq', 1, false);
            administrator       admin    false    271            �           0    0    teach_id_seq    SEQUENCE SET     4   SELECT pg_catalog.setval('teach_id_seq', 1, false);
            administrator       admin    false    256            �           0    0    transaction_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('transaction_id_seq', 1, false);
            administrator       admin    false    244            �           0    0    about_institution_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('about_institution_id_seq', 16, true);
            public       admin    false    231            �           0    0    additional_info_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('additional_info_id_seq', 12, true);
            public       admin    false    281            �           0    0    address_detail_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('address_detail_id_seq', 24, true);
            public       admin    false    235            �           0    0    application_detail_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('application_detail_id_seq', 3, true);
            public       admin    false    316            �           0    0    assign_subject_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('assign_subject_id_seq', 15, true);
            public       admin    false    302            �           0    0    assignment_id_seq    SEQUENCE SET     8   SELECT pg_catalog.setval('assignment_id_seq', 2, true);
            public       admin    false    300            �           0    0    batch_id_seq    SEQUENCE SET     3   SELECT pg_catalog.setval('batch_id_seq', 5, true);
            public       admin    false    293            �           0    0    classe_id_seq    SEQUENCE SET     4   SELECT pg_catalog.setval('classe_id_seq', 3, true);
            public       admin    false    233            �           0    0    contact_detail_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('contact_detail_id_seq', 8, true);
            public       admin    false    237            �           0    0    course_id_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('course_id_seq', 10, true);
            public       admin    false    232            �           0    0    educational_detail_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('educational_detail_id_seq', 6, true);
            public       admin    false    282            �           0    0    emergency_contact_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('emergency_contact_id_seq', 7, true);
            public       admin    false    269            �           0    0    hibernate_sequence    SEQUENCE SET     :   SELECT pg_catalog.setval('hibernate_sequence', 17, true);
            public       admin    false    229            �           0    0    nationality_detail_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('nationality_detail_id_seq', 12, true);
            public       admin    false    284            �           0    0    passport_detail_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('passport_detail_id_seq', 1, true);
            public       admin    false    286            �           0    0    student_detail_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('student_detail_id_seq', 39, true);
            public       admin    false    234            �           0    0    student_id_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('student_id_seq', 101, true);
            public       admin    false    230            �           0    0    r_attendance_outcome_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('r_attendance_outcome_id_seq', 3, true);
            referential       admin    false    254            �           0    0    r_attendance_type_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('r_attendance_type_id_seq', 2, true);
            referential       admin    false    290            �           0    0    r_category_id_seq    SEQUENCE SET     8   SELECT pg_catalog.setval('r_category_id_seq', 2, true);
            referential       admin    false    246            �           0    0    r_class_type_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('r_class_type_id_seq', 4, true);
            referential       admin    false    248            �           0    0    r_contact_person_type_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('r_contact_person_type_id_seq', 8, true);
            referential       admin    false    265            �           0    0    r_country_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('r_country_id_seq', 239, true);
            referential       admin    false    272            �           0    0    r_department_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('r_department_id_seq', 1, false);
            referential       admin    false    312            �           0    0    r_designation_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('r_designation_id_seq', 1, false);
            referential       admin    false    315            �           0    0    r_drop_attendance_reason_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('r_drop_attendance_reason_id_seq', 1, false);
            referential       admin    false    252            �           0    0    r_drop_teach_reason_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('r_drop_teach_reason_id_seq', 2, true);
            referential       admin    false    258            �           0    0    r_event_type_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('r_event_type_id_seq', 1, false);
            referential       admin    false    319            �           0    0    r_fee_id_seq    SEQUENCE SET     3   SELECT pg_catalog.setval('r_fee_id_seq', 4, true);
            referential       admin    false    238            �           0    0    r_level_id_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('r_level_id_seq', 6, true);
            referential       admin    false    280            �           0    0    r_month_id_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('r_month_id_seq', 12, true);
            referential       admin    false    296            �           0    0    r_profil_id_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('r_profil_id_seq', 1, false);
            referential       admin    false    273            �           0    0    r_status_id_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('r_status_id_seq', 2, true);
            referential       admin    false    298            �           0    0    r_syllabus_name_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('r_syllabus_name_id_seq', 3, true);
            referential       admin    false    291            �           0    0    r_teach_outcome_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('r_teach_outcome_id_seq', 1, false);
            referential       admin    false    260            �           0    0    r_user_id_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('r_user_id_seq', 1, false);
            referential       admin    false    278            �           0    0    r_year_id_seq    SEQUENCE SET     4   SELECT pg_catalog.setval('r_year_id_seq', 5, true);
            referential       admin    false    294            B
           2606    106894    academic_year academic_year_pk 
   CONSTRAINT     U   ALTER TABLE ONLY academic_year
    ADD CONSTRAINT academic_year_pk PRIMARY KEY (id);
 O   ALTER TABLE ONLY administrator.academic_year DROP CONSTRAINT academic_year_pk;
       administrator         admin    false    307            >
           2606    115065 $   application_user application_user_pk 
   CONSTRAINT     [   ALTER TABLE ONLY application_user
    ADD CONSTRAINT application_user_pk PRIMARY KEY (id);
 U   ALTER TABLE ONLY administrator.application_user DROP CONSTRAINT application_user_pk;
       administrator         admin    false    305            @
           2606    115075 $   application_user application_user_uq 
   CONSTRAINT     Y   ALTER TABLE ONLY application_user
    ADD CONSTRAINT application_user_uq UNIQUE (email);
 U   ALTER TABLE ONLY administrator.application_user DROP CONSTRAINT application_user_uq;
       administrator         admin    false    305            &
           2606    49535    attendance attendance_pk 
   CONSTRAINT     O   ALTER TABLE ONLY attendance
    ADD CONSTRAINT attendance_pk PRIMARY KEY (id);
 I   ALTER TABLE ONLY administrator.attendance DROP CONSTRAINT attendance_pk;
       administrator         admin    false    277            
           2606    41517     class_schedule class_schedule_pk 
   CONSTRAINT     W   ALTER TABLE ONLY class_schedule
    ADD CONSTRAINT class_schedule_pk PRIMARY KEY (id);
 Q   ALTER TABLE ONLY administrator.class_schedule DROP CONSTRAINT class_schedule_pk;
       administrator         admin    false    251             
           2606    41537 0   contact_person_student contact_person_student_pk 
   CONSTRAINT     g   ALTER TABLE ONLY contact_person_student
    ADD CONSTRAINT contact_person_student_pk PRIMARY KEY (id);
 a   ALTER TABLE ONLY administrator.contact_person_student DROP CONSTRAINT contact_person_student_pk;
       administrator         admin    false    268            
           2606    41539    fee_student fee_student_pk 
   CONSTRAINT     Q   ALTER TABLE ONLY fee_student
    ADD CONSTRAINT fee_student_pk PRIMARY KEY (id);
 K   ALTER TABLE ONLY administrator.fee_student DROP CONSTRAINT fee_student_pk;
       administrator         admin    false    243            
           2606    41541    fees fees_pk 
   CONSTRAINT     C   ALTER TABLE ONLY fees
    ADD CONSTRAINT fees_pk PRIMARY KEY (id);
 =   ALTER TABLE ONLY administrator.fees DROP CONSTRAINT fees_pk;
       administrator         admin    false    241            
           2606    41549 *   instructor_presence instructor_presence_pk 
   CONSTRAINT     a   ALTER TABLE ONLY instructor_presence
    ADD CONSTRAINT instructor_presence_pk PRIMARY KEY (id);
 [   ALTER TABLE ONLY administrator.instructor_presence DROP CONSTRAINT instructor_presence_pk;
       administrator         admin    false    263            F
           2606    115083    journee journee_pk 
   CONSTRAINT     I   ALTER TABLE ONLY journee
    ADD CONSTRAINT journee_pk PRIMARY KEY (id);
 C   ALTER TABLE ONLY administrator.journee DROP CONSTRAINT journee_pk;
       administrator         admin    false    311            L
           2606    123319    log_info log_pk 
   CONSTRAINT     F   ALTER TABLE ONLY log_info
    ADD CONSTRAINT log_pk PRIMARY KEY (id);
 @   ALTER TABLE ONLY administrator.log_info DROP CONSTRAINT log_pk;
       administrator         admin    false    317            D
           2606    115073    ro_users ro_users_pk 
   CONSTRAINT     K   ALTER TABLE ONLY ro_users
    ADD CONSTRAINT ro_users_pk PRIMARY KEY (id);
 E   ALTER TABLE ONLY administrator.ro_users DROP CONSTRAINT ro_users_pk;
       administrator         admin    false    309            
           2606    41557 $   student_presence student_presence_pk 
   CONSTRAINT     [   ALTER TABLE ONLY student_presence
    ADD CONSTRAINT student_presence_pk PRIMARY KEY (id);
 U   ALTER TABLE ONLY administrator.student_presence DROP CONSTRAINT student_presence_pk;
       administrator         admin    false    262            
           2606    41559    teach teach_pk 
   CONSTRAINT     E   ALTER TABLE ONLY teach
    ADD CONSTRAINT teach_pk PRIMARY KEY (id);
 ?   ALTER TABLE ONLY administrator.teach DROP CONSTRAINT teach_pk;
       administrator         admin    false    257            
           2606    41561    transaction transaction_pk 
   CONSTRAINT     Q   ALTER TABLE ONLY transaction
    ADD CONSTRAINT transaction_pk PRIMARY KEY (id);
 K   ALTER TABLE ONLY administrator.transaction DROP CONSTRAINT transaction_pk;
       administrator         admin    false    245            �	           2606    16788 )   about_institution about_institution_pk_id 
   CONSTRAINT     `   ALTER TABLE ONLY about_institution
    ADD CONSTRAINT about_institution_pk_id PRIMARY KEY (id);
 S   ALTER TABLE ONLY public.about_institution DROP CONSTRAINT about_institution_pk_id;
       public         admin    false    198            �	           2606    16401 2   academic_qualification academic_qualification_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY academic_qualification
    ADD CONSTRAINT academic_qualification_pkey PRIMARY KEY (id);
 \   ALTER TABLE ONLY public.academic_qualification DROP CONSTRAINT academic_qualification_pkey;
       public         admin    false    199            �	           2606    16409 $   account_profile account_profile_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY account_profile
    ADD CONSTRAINT account_profile_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.account_profile DROP CONSTRAINT account_profile_pkey;
       public         admin    false    200            �	           2606    41346    address_detail address_pk 
   CONSTRAINT     P   ALTER TABLE ONLY address_detail
    ADD CONSTRAINT address_pk PRIMARY KEY (id);
 C   ALTER TABLE ONLY public.address_detail DROP CONSTRAINT address_pk;
       public         admin    false    202            �	           2606    65924 !   additional_info addtional_info_pk 
   CONSTRAINT     X   ALTER TABLE ONLY additional_info
    ADD CONSTRAINT addtional_info_pk PRIMARY KEY (id);
 K   ALTER TABLE ONLY public.additional_info DROP CONSTRAINT addtional_info_pk;
       public         admin    false    201            �	           2606    16433    annoucement annoucement_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY annoucement
    ADD CONSTRAINT annoucement_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.annoucement DROP CONSTRAINT annoucement_pkey;
       public         admin    false    203            �	           2606    123286 (   application_detail application_detail_pk 
   CONSTRAINT     _   ALTER TABLE ONLY application_detail
    ADD CONSTRAINT application_detail_pk PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.application_detail DROP CONSTRAINT application_detail_pk;
       public         admin    false    204            �	           2606    139661 (   application_detail application_detail_uq 
   CONSTRAINT     \   ALTER TABLE ONLY application_detail
    ADD CONSTRAINT application_detail_uq UNIQUE (code);
 R   ALTER TABLE ONLY public.application_detail DROP CONSTRAINT application_detail_uq;
       public         admin    false    204            <
           2606    98687     assign_subject assign_subject_pk 
   CONSTRAINT     W   ALTER TABLE ONLY assign_subject
    ADD CONSTRAINT assign_subject_pk PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.assign_subject DROP CONSTRAINT assign_subject_pk;
       public         admin    false    303            :
           2606    90495    assignment assignment_pk 
   CONSTRAINT     O   ALTER TABLE ONLY assignment
    ADD CONSTRAINT assignment_pk PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.assignment DROP CONSTRAINT assignment_pk;
       public         admin    false    301            �	           2606    16451    bank_account bank_account_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY bank_account
    ADD CONSTRAINT bank_account_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.bank_account DROP CONSTRAINT bank_account_pkey;
       public         admin    false    205            �	           2606    74111    batch batch_pk 
   CONSTRAINT     E   ALTER TABLE ONLY batch
    ADD CONSTRAINT batch_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.batch DROP CONSTRAINT batch_pk;
       public         admin    false    206            �	           2606    33151    classe classe_pk 
   CONSTRAINT     G   ALTER TABLE ONLY classe
    ADD CONSTRAINT classe_pk PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.classe DROP CONSTRAINT classe_pk;
       public         admin    false    207            �	           2606    41375     contact_detail contact_detail_pk 
   CONSTRAINT     W   ALTER TABLE ONLY contact_detail
    ADD CONSTRAINT contact_detail_pk PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.contact_detail DROP CONSTRAINT contact_detail_pk;
       public         admin    false    208            �	           2606    24968    course course_pk 
   CONSTRAINT     G   ALTER TABLE ONLY course
    ADD CONSTRAINT course_pk PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.course DROP CONSTRAINT course_pk;
       public         admin    false    209            �	           2606    16485    department department_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY department
    ADD CONSTRAINT department_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.department DROP CONSTRAINT department_pkey;
       public         admin    false    210            �	           2606    16493     dw_dimensions dw_dimensions_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY dw_dimensions
    ADD CONSTRAINT dw_dimensions_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.dw_dimensions DROP CONSTRAINT dw_dimensions_pkey;
       public         admin    false    211            *
           2606    65932 (   educational_detail educational_detail_pk 
   CONSTRAINT     _   ALTER TABLE ONLY educational_detail
    ADD CONSTRAINT educational_detail_pk PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.educational_detail DROP CONSTRAINT educational_detail_pk;
       public         admin    false    283            
           2606    65913 &   emergency_contact emergency_contact_pk 
   CONSTRAINT     ]   ALTER TABLE ONLY emergency_contact
    ADD CONSTRAINT emergency_contact_pk PRIMARY KEY (id);
 P   ALTER TABLE ONLY public.emergency_contact DROP CONSTRAINT emergency_contact_pk;
       public         admin    false    264            ,
           2606    65990     equality_data equality_data_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY equality_data
    ADD CONSTRAINT equality_data_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.equality_data DROP CONSTRAINT equality_data_pkey;
       public         admin    false    287            �	           2606    16509    event event_pkey 
   CONSTRAINT     G   ALTER TABLE ONLY event
    ADD CONSTRAINT event_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.event DROP CONSTRAINT event_pkey;
       public         admin    false    212            �	           2606    16517    experience experience_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY experience
    ADD CONSTRAINT experience_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.experience DROP CONSTRAINT experience_pkey;
       public         admin    false    213            �	           2606    16525    finance finance_pkey 
   CONSTRAINT     K   ALTER TABLE ONLY finance
    ADD CONSTRAINT finance_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.finance DROP CONSTRAINT finance_pkey;
       public         admin    false    214            �	           2606    16541 0   information_statistic information_statistic_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY information_statistic
    ADD CONSTRAINT information_statistic_pkey PRIMARY KEY (id);
 Z   ALTER TABLE ONLY public.information_statistic DROP CONSTRAINT information_statistic_pkey;
       public         admin    false    215            �	           2606    16549    institution institution_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY institution
    ADD CONSTRAINT institution_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.institution DROP CONSTRAINT institution_pkey;
       public         admin    false    216            �	           2606    16557 4   institutionregistration institutionregistration_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY institutionregistration
    ADD CONSTRAINT institutionregistration_pkey PRIMARY KEY (id);
 ^   ALTER TABLE ONLY public.institutionregistration DROP CONSTRAINT institutionregistration_pkey;
       public         admin    false    217            �	           2606    16565    lecturer lecturer_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY lecturer
    ADD CONSTRAINT lecturer_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.lecturer DROP CONSTRAINT lecturer_pkey;
       public         admin    false    218            �	           2606    16573    module module_pkey 
   CONSTRAINT     I   ALTER TABLE ONLY module
    ADD CONSTRAINT module_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.module DROP CONSTRAINT module_pkey;
       public         admin    false    219            �	           2606    65958 (   nationality_detail nationality_detail_pk 
   CONSTRAINT     _   ALTER TABLE ONLY nationality_detail
    ADD CONSTRAINT nationality_detail_pk PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.nationality_detail DROP CONSTRAINT nationality_detail_pk;
       public         admin    false    220            �	           2606    16589    note note_pkey 
   CONSTRAINT     E   ALTER TABLE ONLY note
    ADD CONSTRAINT note_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.note DROP CONSTRAINT note_pkey;
       public         admin    false    221            �	           2606    16597    parent_info parent_info_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY parent_info
    ADD CONSTRAINT parent_info_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.parent_info DROP CONSTRAINT parent_info_pkey;
       public         admin    false    222            �	           2606    65969 "   passport_detail passport_detail_pk 
   CONSTRAINT     Y   ALTER TABLE ONLY passport_detail
    ADD CONSTRAINT passport_detail_pk PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.passport_detail DROP CONSTRAINT passport_detail_pk;
       public         admin    false    223            �	           2606    16613 $   personal_detail personal_detail_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY personal_detail
    ADD CONSTRAINT personal_detail_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.personal_detail DROP CONSTRAINT personal_detail_pkey;
       public         admin    false    224            �	           2606    16621    profile_info profile_info_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY profile_info
    ADD CONSTRAINT profile_info_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.profile_info DROP CONSTRAINT profile_info_pkey;
       public         admin    false    225            �	           2606    16634 &   reference_detail reference_detail_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY reference_detail
    ADD CONSTRAINT reference_detail_pkey PRIMARY KEY (id);
 P   ALTER TABLE ONLY public.reference_detail DROP CONSTRAINT reference_detail_pkey;
       public         admin    false    226            �	           2606    33205    student_detail student_pk 
   CONSTRAINT     P   ALTER TABLE ONLY student_detail
    ADD CONSTRAINT student_pk PRIMARY KEY (id);
 C   ALTER TABLE ONLY public.student_detail DROP CONSTRAINT student_pk;
       public         admin    false    227            �	           2606    16647    syllabus syllabus_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY syllabus
    ADD CONSTRAINT syllabus_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.syllabus DROP CONSTRAINT syllabus_pkey;
       public         admin    false    228            .
           2606    66006    visa_detail visa_detail_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY visa_detail
    ADD CONSTRAINT visa_detail_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.visa_detail DROP CONSTRAINT visa_detail_pkey;
       public         admin    false    288            N
           2606    131475    r_event_type event_type_pk 
   CONSTRAINT     Q   ALTER TABLE ONLY r_event_type
    ADD CONSTRAINT event_type_pk PRIMARY KEY (id);
 I   ALTER TABLE ONLY referential.r_event_type DROP CONSTRAINT event_type_pk;
       referential         admin    false    320            6
           2606    74144    r_month month_pk 
   CONSTRAINT     G   ALTER TABLE ONLY r_month
    ADD CONSTRAINT month_pk PRIMARY KEY (id);
 ?   ALTER TABLE ONLY referential.r_month DROP CONSTRAINT month_pk;
       referential         admin    false    297            0
           2606    66018 %   r_attendance_type r_attendace_type_pk 
   CONSTRAINT     \   ALTER TABLE ONLY r_attendance_type
    ADD CONSTRAINT r_attendace_type_pk PRIMARY KEY (id);
 T   ALTER TABLE ONLY referential.r_attendance_type DROP CONSTRAINT r_attendace_type_pk;
       referential         admin    false    289            
           2606    41519 ,   r_attendance_outcome r_attendance_outcome_pk 
   CONSTRAINT     c   ALTER TABLE ONLY r_attendance_outcome
    ADD CONSTRAINT r_attendance_outcome_pk PRIMARY KEY (id);
 [   ALTER TABLE ONLY referential.r_attendance_outcome DROP CONSTRAINT r_attendance_outcome_pk;
       referential         admin    false    255            
           2606    41521    r_category r_category_pk 
   CONSTRAINT     O   ALTER TABLE ONLY r_category
    ADD CONSTRAINT r_category_pk PRIMARY KEY (id);
 G   ALTER TABLE ONLY referential.r_category DROP CONSTRAINT r_category_pk;
       referential         admin    false    247            

           2606    41525    r_class_type r_class_type_pk 
   CONSTRAINT     S   ALTER TABLE ONLY r_class_type
    ADD CONSTRAINT r_class_type_pk PRIMARY KEY (id);
 K   ALTER TABLE ONLY referential.r_class_type DROP CONSTRAINT r_class_type_pk;
       referential         admin    false    249            
           2606    41527 .   r_contact_person_type r_contact_person_type_pk 
   CONSTRAINT     e   ALTER TABLE ONLY r_contact_person_type
    ADD CONSTRAINT r_contact_person_type_pk PRIMARY KEY (id);
 ]   ALTER TABLE ONLY referential.r_contact_person_type DROP CONSTRAINT r_contact_person_type_pk;
       referential         admin    false    266            �	           2606    41569    r_country r_country_pk 
   CONSTRAINT     M   ALTER TABLE ONLY r_country
    ADD CONSTRAINT r_country_pk PRIMARY KEY (id);
 E   ALTER TABLE ONLY referential.r_country DROP CONSTRAINT r_country_pk;
       referential         admin    false    236            H
           2606    115094    r_department r_department_pk 
   CONSTRAINT     S   ALTER TABLE ONLY r_department
    ADD CONSTRAINT r_department_pk PRIMARY KEY (id);
 K   ALTER TABLE ONLY referential.r_department DROP CONSTRAINT r_department_pk;
       referential         admin    false    313            J
           2606    115102    r_designation r_desingation_pk 
   CONSTRAINT     U   ALTER TABLE ONLY r_designation
    ADD CONSTRAINT r_desingation_pk PRIMARY KEY (id);
 M   ALTER TABLE ONLY referential.r_designation DROP CONSTRAINT r_desingation_pk;
       referential         admin    false    314            
           2606    41529 4   r_drop_attendance_reason r_drop_attendance_reason_pk 
   CONSTRAINT     k   ALTER TABLE ONLY r_drop_attendance_reason
    ADD CONSTRAINT r_drop_attendance_reason_pk PRIMARY KEY (id);
 c   ALTER TABLE ONLY referential.r_drop_attendance_reason DROP CONSTRAINT r_drop_attendance_reason_pk;
       referential         admin    false    253            
           2606    41531 *   r_drop_teach_reason r_drop_teach_reason_pk 
   CONSTRAINT     a   ALTER TABLE ONLY r_drop_teach_reason
    ADD CONSTRAINT r_drop_teach_reason_pk PRIMARY KEY (id);
 Y   ALTER TABLE ONLY referential.r_drop_teach_reason DROP CONSTRAINT r_drop_teach_reason_pk;
       referential         admin    false    259             
           2606    41533    r_fee r_fee_pk 
   CONSTRAINT     E   ALTER TABLE ONLY r_fee
    ADD CONSTRAINT r_fee_pk PRIMARY KEY (id);
 =   ALTER TABLE ONLY referential.r_fee DROP CONSTRAINT r_fee_pk;
       referential         admin    false    239            (
           2606    57759    r_level r_level_pk 
   CONSTRAINT     I   ALTER TABLE ONLY r_level
    ADD CONSTRAINT r_level_pk PRIMARY KEY (id);
 A   ALTER TABLE ONLY referential.r_level DROP CONSTRAINT r_level_pk;
       referential         admin    false    279            "
           2606    41577    r_profil r_profil_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY r_profil
    ADD CONSTRAINT r_profil_pkey PRIMARY KEY (id);
 E   ALTER TABLE ONLY referential.r_profil DROP CONSTRAINT r_profil_pkey;
       referential         admin    false    274            2
           2606    66032    r_syllabus r_syllabus_name_pk 
   CONSTRAINT     T   ALTER TABLE ONLY r_syllabus
    ADD CONSTRAINT r_syllabus_name_pk PRIMARY KEY (id);
 L   ALTER TABLE ONLY referential.r_syllabus DROP CONSTRAINT r_syllabus_name_pk;
       referential         admin    false    292            
           2606    41535 "   r_teach_outcome r_teach_outcome_pk 
   CONSTRAINT     Y   ALTER TABLE ONLY r_teach_outcome
    ADD CONSTRAINT r_teach_outcome_pk PRIMARY KEY (id);
 Q   ALTER TABLE ONLY referential.r_teach_outcome DROP CONSTRAINT r_teach_outcome_pk;
       referential         admin    false    261            $
           2606    115104    r_user_type r_user_type_pk 
   CONSTRAINT     Q   ALTER TABLE ONLY r_user_type
    ADD CONSTRAINT r_user_type_pk PRIMARY KEY (id);
 I   ALTER TABLE ONLY referential.r_user_type DROP CONSTRAINT r_user_type_pk;
       referential         admin    false    275            8
           2606    74142    r_status status_pk 
   CONSTRAINT     I   ALTER TABLE ONLY r_status
    ADD CONSTRAINT status_pk PRIMARY KEY (id);
 A   ALTER TABLE ONLY referential.r_status DROP CONSTRAINT status_pk;
       referential         admin    false    299            4
           2606    74146    r_year year_pk 
   CONSTRAINT     E   ALTER TABLE ONLY r_year
    ADD CONSTRAINT year_pk PRIMARY KEY (id);
 =   ALTER TABLE ONLY referential.r_year DROP CONSTRAINT year_pk;
       referential         admin    false    295            P
           2606    41394 '   parent_info fk30em3qy0x7nf6afkdtjggo0jt    FK CONSTRAINT     �   ALTER TABLE ONLY parent_info
    ADD CONSTRAINT fk30em3qy0x7nf6afkdtjggo0jt FOREIGN KEY (student_fk) REFERENCES student_detail(id);
 Q   ALTER TABLE ONLY public.parent_info DROP CONSTRAINT fk30em3qy0x7nf6afkdtjggo0jt;
       public       admin    false    227    2554    222            O
           2606    41384 (   bank_account fk70tbnlf24eoltv2ugswcoaydf    FK CONSTRAINT     �   ALTER TABLE ONLY bank_account
    ADD CONSTRAINT fk70tbnlf24eoltv2ugswcoaydf FOREIGN KEY (student_id) REFERENCES student_detail(id);
 R   ALTER TABLE ONLY public.bank_account DROP CONSTRAINT fk70tbnlf24eoltv2ugswcoaydf;
       public       admin    false    2554    205    227            Q
           2606    41399 (   profile_info fkqa2s3nwbq3llrf3gfq328iaiq    FK CONSTRAINT     �   ALTER TABLE ONLY profile_info
    ADD CONSTRAINT fkqa2s3nwbq3llrf3gfq328iaiq FOREIGN KEY (student_fk) REFERENCES student_detail(id);
 R   ALTER TABLE ONLY public.profile_info DROP CONSTRAINT fkqa2s3nwbq3llrf3gfq328iaiq;
       public       admin    false    225    227    2554            8      x�3�4�44�4BC�=... (9      6   =   x�3�,I-.q z���h��
��j�Ĕ��<�ZN#C]C]C#+0�,����� R�7            x������ � �             x������ � �            x������ � �      �
      x�3���440Q��+F��� mcf      �
      x������ � �            x������ � �      <   s   x���;AC��\`3�g痊p��t����`E�Ҹx~��%:��e�^�]����\�'"�Ո���r$�`6���Hf�`�5]��{��
h�4���>�ʈ�����T��#:�      B   t   x�3�0�������������e�鞑�����W�Z��X��������������l`�C�1�M��hJ�F3r5���т\���j44 [�!�:�N<�d��=... ���      :   $   x�3�q�LL����4300�1~h�+F��� ��
            x������ � �            x������ � �      �
      x������ � �      �
   �   x�5�A
�0EדS�!��pז����[��6%�I4!x�����{���>D��������i啌<�@��m?j� g��/��/��Gr꽁.����j�Ac�����o���a��,�}7H�cp.Ru�@U�Ĥ�-J4�      �
      x������ � �      �
      x������ � �      �
      x�3�440��C���
d\Q����� ��      �
   k   x�(J-.���2T0�p� �PoN�����JN##NC#N�ļ���̢T�������������	*��)�$571ϡ49'1O/1Y�4�ӄӂ�
8c��b���� �� 	      �
      x������ � �      �
   =   x�+I-.q(z�������1~X���*ASm��
���\ALc� ������ ��      4   !   x�34��4�4�24�44�4�La�=... P�x      2      x������ � �      �
      x������ � �      �
   6   x���s���44 ��&@�+9?���$�H!8935/9$ed Uf
R���� ��      �
      x�3��#���<�jb���� �,@      �
   )   x����଀cU�id�ildhd̙�qZp��qqq Fb      �
   X   x�r������,.�/�1-8+**89�8-8��@b�D秕�'�*�������敀��F�07�410�nD� QO�      �
      x�34�.Cs0���� 	�      �
      x������ � �             x�3��Â���pK��qqq �*         /   x�32624�F))ŉ)�)�f� �8S��������+F��� �K      $      x������ � �      �
   !   x�3�4�4204�#+0�.f����� ��      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
   %   x�34�@C#��� ��!*���b���� c��      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
      x������ � �      �
   :   x������tI��L��t�,)���46��M�I�440�r�rq� N����� � !      �
      x������ � �      "      x������ � �      %      x������ � �            x�3�LLL����� �      &      x�3�tI�̩���2�OM͆�c���� m|�      �
      x�3⬨ ��
�=... "��      �
   '   x�3�t�K��,�ନ���CC\&���% 9��1z\\\ [��         .   x�3�,O-�2�L�2�462�2�4�2�42��!�1�P0F��� ��t      �
      x�mZYs�H~����LDτ��B���H�/�fl�e�ER�ڿ~�,d�{v"�����<�̒�"o��<�/'��ǧ�8��ݑ�� W'Ux)y�"���:n�C�i�&�{4���Ï�����#U#M�I^M^���˕��
�=��;*u�<b�:#��� CxK��eQU�;>���q���E��
��"����Ѩ ���,��<���<~L��Y�G���w�ƫ�gչ���8�;�?r�1I����߫�v)i��K�t��僚�o"�^�!WxyUbn��ǌc�}�kd�.��������s/�Yed��!��-:Z��/w��d�:i��m�ג��M奼��t��/�֤[d�����L�N!�2d@�`2d�+ߋoX�o�t����!�*�.b
�&�[{D�wO�sw"]8�j��	���L1u�����l�/A�G��k�v��C�П�ȏ�d�����'f��,x+��a�^�O��{A;\���Sp$���.�H+0L㠉�L�m�����dZ�|M���1�����=A�̅J�&��|���X������Ǣa�����̲���X���7�|˖�?]؈�&'��˧7�4�@(�x�A(h��t1��@QC/�ҭ�jFņ5�OP�w�~z��o�V~�&��ؤ��[Lo�''�O�;&�zd��H��H�M�(q��Y���[V��k�fW`���S��m8p�� M�"�U�������]!�m�
�EIM�y8=)��a���=�m�	���z݉�C,`X��a�,Y����D��r�e�r>u���rr��P,�o��c�/�ǎ�܏�p�tI��V��pPYy5�|���oʪ;��<rL/��L��6Lv���Ƿ�p ;+�dM����KA�|7�f����f�%��iª(r��q<R��Tp`��ul�_�-y�c5B���� l�.CeV�/��駇��rӆ(ux^W$;��20}e��g0y�剂N���	���8&��[��
��O��)���sv�U�r�;��b��[d��YR�����j�%���k"H1�8��p�q�)\���g�"�y��Ahe�ƍ1�`�����h�3x���q~�M�7�N\E������<������~|�����0R*0?-2�%9��;H=pX��[$d�U�K>��� ��X.�"� a��F�8F�����4�PY�YT�ϕb�C��/���W���x?u�EP�?yk��p���	Y&�)�O���|�����*�
=��
���J��.�����f�Škp�ś"��d�[��a�	�ԓ��D4p�AU�FXrq���e%��R�A,��/��<:<�����y���~-��|��S���'}��>�%\��Сv,/�Lh�W�����M_i�'�p�-d:byC˛���i��p7^��@�0(>�+�-�,ΙK��y82������dÁZ�,>�>��;�'�&,4Z+ E|�(�� �M�	{�,M��Ѯl(||}9�79�-]�
S��t3/q v:|����Ba��2��n)�m=8��(�����t�L<�Ǿ�(���O�q[��&<wŴp�(Іi�=�e�0��n
F-��<2jA�ư*�!�ެ�d���0�0M�����UB+/MXkߕW�%õ��_i�����2�pMx���D�>��rŪ�JU~�������VP�uu�H���Uy���Z��>�K�*V�s�uV�Q:���db�&V��� ����{n�F�3:ٺ�V�s�+���w5�G�+X�!8jW � ��Q~P�E���:��P���c���q�2��ǜ:d�#��a�>��Z?�ӏ8;����n["�(�|D���CX�7��U@%�Q���N:�(�8����E1A?N�L�Ɍ{]�lXSTI;PL�E�0K�8`�ᒳњ8��O�1kp�q�9��b�b��؜��	М� E`<F��@���0�,���!��
 I C�����@�*�#Y2�����A8��� �7�/SD%Ԛm��`��a��`��h����Lm�.c�g|e�\�V�OlBh����P��d� �� ��Nߍ�sN���+��u�7?:j�d�������pd�&���Nr��:�������Uź���F�����97��r58����:%͂e�{��Һ�w��4�����o�v�Rl<ZCѕ:�_6�:��AO��Jkh�R�=F9����=g��W������a]�˶BJ���	9���f'��)�	�DJ���QI���`H]����m��������mP8�F���k��P�Q|�K-����������D�$A.cs9�;�پA0Ά/�r� UWó|���~���|�,}�`��*��oy�[��|�bFiq���8D����l6�9�B@�q]yH�����n�t۵�����/�Q|����(�`��S�dt�$���D��h��s�����M��@��{AftS��G���7�Ւ������+��dO�����,T$�[��I�)Ћ��APR�;������7V1��U�y'1%q�PBJ�i���q��
�Q�wRRR ~���ʰ(��_�O�IF��/�a[ُ/��_���U��,�U�T���b�'&�����"�R�na��\��v)�"��p-���'�*��g&�N��o3��=m�%_�pF�W���?�SJ���u���
X��ŋZ0$��n����-�
 �	�PUm������# ��]wDJ���#�8"�ARͺ �i<?��"o3�X��+��/�M�p'�M)�UC_H��<K@OA�x��+��k�}'g�%*���)��OP�W^`���TMi��?�0��f�����x:�Ñ�@l��|4M���u+Kd�p~��"Yڴ�n�nť']�-��!2ȶ�(���Gy����t-�EVP�`o��w#c�SL��Y�]ᒱ؜^��
9��k�nd�^a����ڜc��	Y���<��+�~ҷ,Y"J#G�P5Kd6Zz�W����cw�GHΖ�5�b�l�m�#�6ѡ�>P�O�sk�L��N��2�+��lW�ȑ�نi���4�7��l�A��
"}!����>��������Fnq������VP]��U����#�e�tz�����!m59y�sRu]d�<��mC&?����S��buFu2���3�$�Z�u 0�Y��p$FWu����m}��eh���|SK��2��ix���|�ߋ&H?UL������l��w���Y2��3B@���EY��&.�[K��9.a��a���xO��:3�V�\U��������we��a��7�\.�?�!� �s�����ŧ��Ά�6 ��	���g�\����#�l@�555�/���'���LB���qπ�
��@n8����WI� 3:2ۃdϠW
w|c�+�[�A�H��x	��38�g�.�H�
K n���s�k��h#�f���E^���Z\���29�㢯ሼ�<,�����;P^B5.2w\�c d�?+n�3ԟu6O� u�p�����R�Bv
��y����Q$��N ƪ��<��x��`0�t�هP�T�2:6WwD����Г ���}'AF�)| ���Eg͕@L90��=^:�gu�i�<D��<���8G�x?S@�0l���@b�lO5!	08�8����6�JhB+ʋjU��������^=��	�p�H5�J�0�\s��y`�oe\|<v?�dira�b�oBx���v<�{��-l��kYQdT o�I�r��<(���2��K�'���:�Ϡ[�.���r���A	�_�L�5qm>�.ʚ���Ï}.�~Q`m�K�؟ع}��b����2���7�/d!��� �����d�\��LQF�*[Oa��f7e�r�֑k�SB�&\�e�l���a��|�
�
��C�`e"[ +C�N�È��A�OT���u� 2  �e�q��0��`��SPb/(��
��2n��t9��aS�0j�[T{!`���YG���n�\��A#EPmȥAOմl��*\a�%��ŏU|"���lê)��VPy������1N�{�1ٺ�����������g`p�QT!Ua���OU9�Oh�đe,�6EUPŊ��g~І	j���ږ ���Zp�r���Ă��4�e����ڶ�����ӫ��E�-�[���zM�獲Sd�Tw����k���Y�\&Nϯ�I�4�L2�p��k����I&�y�m8Q��,���� ���i��{��{F]?�Ivp�1eWZ�yU�sF�?���� ���L�����1ς[�0�:�ؼo��s���u|ͅ�o�j��x��^�!�\a�J�	 R�Q�K���b�|��B���%�Q��g�Rw��9�T#�p��m>�)�����|A�V�0�0���˕�{?��T7%�s�E2U�8��.c	�%C/����(W���2wlQ�ma�����g�G[�O��rIY�VX�ח,�<�Y����!�c7O�ƫo�9t\Q���.�qԪ����^ƪz �p�v�x�2��4̡���)iLCu�ؐ%L�UE��&˔��_�qQ�Pqp�����L�I�	`��̀M�6〮.�X�\&�O��&��[�c%D�S�oŏ����/452"� �߅��"�Ϻ5����X���/a�=�� x}�!Y����[��t�C�k����^�v
;�B���8X:�u-�}(���{�>�?�_}Gu�B*��~��߰G\8�����*V�G��N��vǯ0S� ��%��(�T����N��%��si��0�Wa*�e�3BN�=ds�ǵA��@�K�j.[�H��A5�o��KV|�iE�=v�wq��C�{�����.��ί�����T�,tjG��ub��p�Gn�m���M�n�f?�/�vt���JX�*͐b�S?R����Ĝ�~�۠$�⊈�ɶh��x�kGeUH��OJ�+[�߹vTN�P|��3����l��Y;[����������� ����s���-\��A��=�t"
q&�9h��['���8p�9h��'���u!�55ko�t��͌Fv���TU4)51�o�[Bj��q�-F�?���EQSD5��H>l���I0�����k��IR��ɂ]�j�SF�����1���|S45P�x��j�>�䤁ݬS�x���Xʖ?h���h�R������^�A#��r��U%�����[ds��Oer�/2�T���YH	4�����H�9���#黁��9��������U�j��A<�S�.0��@���YU��0h%@��4�� �	`�6ៅ��~埅���!��؅��Y����Y��iMW���>��"M������KCD���N�ۮ�x���"�i���/�`�J?g���s�K-�����D��L� ���m�;���П� r8��R\·W��o���E�#�޶�E������Ǖ:+�=�{?��c�v�_����KBWlZ�xy�5��;^��6-r9ùF��؄� �u<� ־�t܇�4$\1�[�8lNW7CV���&��c��c@�&��G,��\��)�1��?hqr��%t���o���������~��)�r�.{`�튶^�Ƴb�ZX�G��pf�^]�x�m�"�8[��n�pM[���l=�-;��z����GI��q�����v!l�v=����)m8]��!���7���F�� �a���-����|Ą��|��}�i�BtF\�߿!��
�      >      x������ � �      ?      x������ � �            x������ � �            x�3��Ȩ������ ��      E      x������ � �      �
      x�3�,NS �������� 5�X         :   x�3�t���IMO��2���LN2L9C�2�R��3K*9��8}KR��R��8�b���� �a�      .   q   x�5�A� ����S�����%���`Yy�s*�j��
�v�H`fj�*:�:����9��\���rW�.�Vb� �Xˈ]�(�'�z�Oї��Rp>])��,ӭ�!�9w�            x������ � �      0   #   x�3�tt�sU@\F�.�`	�$)�=... ��      )   ,   x�3�t�+)JMU0K�M���2�tr��9��A�=... �	q      
      x������ � �            x������ � �      ,   '   x�3�420��2Q�\�@�Ȁ�Dr��(#�=... |��     