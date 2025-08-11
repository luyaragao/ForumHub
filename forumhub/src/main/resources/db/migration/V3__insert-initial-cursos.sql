-- cursos iniciais que ja estarão disponíveis no sistema de acordo com as categorias

-- BACK_END
INSERT INTO cursos(nome, categoria) VALUES('Java e Spring Boot: Fundamentos de APIs REST', 'BACK_END');
INSERT INTO cursos(nome, categoria) VALUES('Node.js: Criando APIs com Express', 'BACK_END');
INSERT INTO cursos(nome, categoria) VALUES('Python com Django: Desenvolvimento Web Avançado', 'BACK_END');

-- FRONT_END
INSERT INTO cursos(nome, categoria) VALUES('React: Desenvolvendo com JavaScript', 'FRONT_END');
INSERT INTO cursos(nome, categoria) VALUES('Angular: Criando Single-Page Applications', 'FRONT_END');
INSERT INTO cursos(nome, categoria) VALUES('Vue.js: Componentes e Reatividade', 'FRONT_END');

-- DATA_SCIENCE
INSERT INTO cursos(nome, categoria) VALUES('SQL e Modelagem de Dados', 'DATA_SCIENCE');
INSERT INTO cursos(nome, categoria) VALUES('Python para Análise de Dados com Pandas', 'DATA_SCIENCE');

-- DEVOPS
INSERT INTO cursos(nome, categoria) VALUES('Docker: Do Zero à Implantação', 'DEVOPS');
INSERT INTO cursos(nome, categoria) VALUES('Kubernetes: Orquestração de Containers', 'DEVOPS');