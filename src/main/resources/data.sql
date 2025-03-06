INSERT INTO alsc_usuario (id, nome, login, senha, email) VALUES (1, 'Andre', 'luiz', '123', 'teste@email.com');

ALTER SEQUENCE alsc_usuario_id_seq RESTART WITH 2;

INSERT INTO alsc_perfil (id, descricao) VALUES (1, 'Administrador');

ALTER SEQUENCE alsc_perfil_seq RESTART WITH 2;