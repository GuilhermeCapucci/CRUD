Contruido com:

Java 17
Spring Boot 2.6.7
H2 Database
Spring Web
Spring Data JPA
Spring Boot DevTools
Spring Tools Suite 4
Postman

----------------------------------------------------

Cadastrar um cachorro:

Para cadastrar um cachorro abra o Postman, escolha o método POST e coloque a URL http://localhost:8080/cachorro

na aba body, opção raw/JSON abra uma chave ({) e passe id, nome, raca, idade e clique em Send para enviar
(Lembrando que o cachorro só fica salvo enquanto o programa estiver rodando, pois estamos utilizando o banco h2).

----------------------------------------------------

Buscar todos os cachorros cadastrados:

Escolha o método GET e coloque a URL http://localhost:8080/cachorro
Clique em Send para aparecer todos os cachorros

----------------------------------------------------
Buscar um cachorro específico pelo id:

Escolha o método GET e coloque a URL http://localhost:8080/cachorro/ (após a ultima barra colocar o id do cachorro que deseja buscar. 
Ex: http://localhost:8080/cachorro/3) Clique em Send para mostrar o cachorro escolhido.

----------------------------------------------------

Para deletar um cachorro: 

Escolha o método DELETE e coloque a URL http://localhost:8080/cachorro/ (após a ultima barra colocar o id do cachorro que deseja deletar.
Ex: http://localhost:8080/cachorro/2) Clique em Send para deletar o cachorro escolhido)

----------------------------------------------------
