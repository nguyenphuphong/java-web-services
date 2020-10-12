CREATE SEQUENCE sq_information_id;

CREATE TABLE tb_information (
    id INT NOT NULL DEFAULT sq_information_id.nextval PRIMARY KEY,
    destination VARCHAR(25),
    title VARCHAR(255),
    description VARCHAR(1000)
);

INSERT INTO tb_information (destination, title, description) VALUES ('China', 'Bachelor of Art: Business Administration at DHU', '<p>Founded in 1951, Donghua University (DHU) is one of the 75 universities under the direct management of the Ministry of Education of China. It is one of the universities that accepted international students as early as in 1954, as well as one of the first batch of 27 universities that have passed the Quality Accreditation for International Students Education. DHU enrolls over 4800 international students from nearly 140 countries each year, which ranks the 10th among the universities in China.</p><p>Located in the downtown area of Shanghai, International Cultural Exchange School (ICES) is on DHU’s Yan’an road campus. We provide both long-term and short-term Chinese language programs, which were inspected by Eaquals (Evaluation and Accreditation of Quality Language Services) in 2018 and met the high standards required for Eaquals accreditation.</p>');