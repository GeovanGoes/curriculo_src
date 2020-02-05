
INSERT INTO usuario (id, nome, email, user_name, senha) VALUES (1, 'Geovan da Silva Goes', 'geovansilvagoes@gmil.com', 'GeovanGoes', '123455567890');

INSERT INTO endereco (id, rua, estado, cidade, cep) VALUES (1, 'Rua josé dias da costa', 'SP', 'São Paulo', '05661-060');
INSERT INTO curriculo (id, nome, data_nascimento, numero_celular, email, endereco_id, cargo) VALUES (1, 'Geovan Goes', '1992-02-15', '(11) 98976-2229', 'geovansilvagoes@gmail.com', 1, 'Programador');


INSERT INTO tipo_formacao (id, descricao) VALUES (1, 'Formação Acadêmica');
INSERT INTO tipo_formacao (id, descricao) VALUES (2, 'Formação Complementar');

INSERT INTO formacao (id, nome_instituicao, descricao_instituicao, is_concluido, ano_conlusao, tipo_formacao_id, nome_curso, curriculo_id) VALUES (1, 'SENAC', '', 1, 2015, 1, 'Tecnologia em Análise e Desenvolvimento de Sistemas', 1);
INSERT INTO formacao (id, nome_instituicao, descricao_instituicao, is_concluido, ano_conlusao, tipo_formacao_id, nome_curso, curriculo_id) VALUES (2, 'ETEC - Guaracy Silveira', '', 1, 2013, 1, 'Técnico em Eletrônica', 1);


INSERT INTO formacao (id, nome_instituicao, descricao_instituicao, is_concluido, ano_conlusao, tipo_formacao_id, nome_curso, curriculo_id) VALUES (3, 'SENAC', '', 1, 2010, 2, 'Técnico - Gestão em Vendas', 1);
INSERT INTO formacao (id, nome_instituicao, descricao_instituicao, is_concluido, ano_conlusao, tipo_formacao_id, nome_curso, curriculo_id) VALUES (4, 'ESPRO', '', 1, 2009, 2, 'Técnicas Bancárias', 1);
INSERT INTO formacao (id, nome_instituicao, descricao_instituicao, is_concluido, ano_conlusao, tipo_formacao_id, nome_curso, curriculo_id) VALUES (5, 'AOB', '', 1, 2007, 2, 'Gestão Pessoal e Empresarial', 1);

INSERT INTO tipo_habilidade (id, titulo) VALUES (1, 'Linguagens e Conceitos');
INSERT INTO tipo_habilidade (id, titulo) VALUES (2, 'Frameworks, Bibliotecas, Padrões e Sistemas Operacionais');
INSERT INTO tipo_habilidade (id, titulo) VALUES (3, 'Idiomas e Ferramentas de Escritório');


INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (1, 1, 'JAVA Web/Desktop', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (2, 1, 'Programação Orientada a Objetos', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (3, 1, 'Metodologias de Desenvolvimento Ágil', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (4, 1, 'BásicoPHP', 'Básico', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (5, 1, 'SQL', 'Básico', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (6, 1, 'HTML 5', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (7, 1, 'CSS 3', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (8, 1, 'Javascript', 'Intermediário', 1);

INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (9, 2, 'Spring Framework', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (10, 2, 'Hibernate 4', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (11, 2, 'JPA', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (12, 2, 'CDI', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (13, 2, 'jQuery', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (14, 2, 'Bootstrap', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (15, 2, 'JSF', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (16, 2, 'EJB', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (17, 2, 'Primefaces', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (18, 2, 'MVC', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (19, 2, 'Linux Ubuntu/Debian', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (20, 2, 'Windows', 'Avaçado', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (21, 2, 'Mac OS', 'Intermediário', 1);

INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (22, 3, 'Português', 'Nativo', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (23, 3, 'Inglês - Escrita/Leitura', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (24, 3, 'Inglês - Conversação', 'Básico', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (25, 3, 'Espanhol', 'Básico', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (26, 3, 'MS Access', 'Intermediário', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (27, 3, 'MS Excel', 'Avaçado', 1);
INSERT INTO habilidade (id, tipo_habilidade_id, titulo, nivel, curriculo_id) VALUES (28, 3, 'MS Word', 'Intermediário', 1);


INSERT INTO experiencia_profissional (id, nome_empresa, descricao_empresa, cargo, data_inicio, data_fim, descricao_experiencia, curriculo_id, site) VALUES (1, 'IBFC', 'Inst. Bras. deFormação e Capacitação', 'Analista de Suporte Computacional', '2014-05-01', '2015-06-01', 'Análise/Processamento de dados. Desenvolvimento de pequenas aplicações para uso interno (PHP)', 1, 'http://www.ibfc.org.br');
INSERT INTO experiencia_profissional (id, nome_empresa, descricao_empresa, cargo, data_inicio, data_fim, descricao_experiencia, curriculo_id, site) VALUES (2, 'Tecnomira', '', 'Técnico em Eletrônica', '2013-04-01', '2014-05-01', 'Manutenção em controles remotos industriais e em paralelo. Desenvolvimento de aplicações para uso interno (JAVA)', 1, 'http://www.tecnomira.com.br');
INSERT INTO experiencia_profissional (id, nome_empresa, descricao_empresa, cargo, data_inicio, data_fim, descricao_experiencia, curriculo_id, site) VALUES (3, 'Control Service', '', 'Técnico em Eletrônica', '2012-04-01', '2013-04-01', 'Manutenção em terminais eletrônicos para fim de pagamento. Experiência com solda de componentes SMD', 1, 'http://www.controlservice.com.br');
INSERT INTO experiencia_profissional (id, nome_empresa, descricao_empresa, cargo, data_inicio, data_fim, descricao_experiencia, curriculo_id, site) VALUES (4, 'Santander/Real', '', 'Aprendiz - Auxiliar Administrativo – Marketing', '2008-04-01', '2009-04-01', 'Organização de material publicitário. Elaboração de planilhas de controle para material distribuído. Elaboração da base de dados para confecção de relatórios.', 1, 'https://www.santander.com.br');

INSERT INTO atividade_academica (id, titulo, descricao, detalhes, curriculo_id) VALUES (1, 'Projeto Integrador IV', 'Desenvolvido durante o 1º semestre de 2015', 'Introdução - Desenvolvimento de um sistema Web que permita a escolha de um veículo, personalização do veículo escolhido e ao final de tudo emitir um descritivo do pedido com o endereço da concessionária mais próxima(previamente cadastrada no sistema).
Foram implementados CRUDS para o cadastro de veículo, concessionárias, acessórios e kits de acessórios. Regras de negócio foram implementadas conforme o case apresentado pela banca. Estatísticas de acesso e relatórios diversos foram implementados.
Tecnologias utilizadas nesse projeto:
Projeto desenvolvido em linguagem JAVA utilizando conceitos de Orientação a Objetos, o Spring Framework foi utilizado. Para as views utilizei JSP, HTML5, CSS3, Bootstrap, JQuery e AJAX.
A persistência foi feita seguindo a espeficicação JPA a ferramenta escolhida foi o Hibernate e as transações foram gerenciadas pelo Spring ORM. Injeção de dependência do Spring foi utilizado. Padrões de projeto como MVC(Model, view e controller), Singleton, EAO(Entity Access Object) e Factory foram aplicados. O conceito de SOA(Service-Oriented Architecture) foi abordado. Durante o desenvolvimento do projeto foi utilizado o GitHub para controle de versão.', 1);

INSERT INTO atividade_academica (id, titulo, descricao, detalhes, curriculo_id) VALUES (2, 'Projeto Integrador III', 'Desenvolvido durante o 2º semestre de 2014', 'Introdução - Desenvolvimento de um pequeno sistema desktop para fins avaliativos, onde o case apresentado pela banca englobava diversos setores de uma empresa fictícia de varejo. Todos os setores deveriam ser atendidos pelo sistema desenvolvido. Vendas, Caixa, Administrativo, Estoque, Gerência e Logística foram os setores atendidos.
CRUDS, regras de negócio e relatórios foram implementados nesse projeto.
Projeto executado utilizando a metologia ágil SCRUM,onde eram feitas entregas de pequenas partes do projeto de acordo com a duração de cada Sprint.
Tecnologias utilizadas nesse projeto:
Projeto desenvolvido em linguagem JAVA, utilizando JAVA Swing para as views, persistência feita em XML, foram utilizados conceitos de Orientação a Objetos e padrões de projeto como MVC, Singleton, DAO e Factory. Durante o desenvolvimento do projeto foi utilizado o Subversion Google Code para controle de versão.', 1);
