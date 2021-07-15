# KNOWLEDGEDOORS
Sistema de Gerenciamento da Biblioteca
Enunciado 1 - Exercício de Programação - 2021/2
desenvolver um sistema de biblioteca no seu bairro. Por enquanto, a biblioteca possui apenas 3 livros:
Como fazer sentido e bater o martelo - Autor: Alexandro Aolchique - Ano: 2017
Código Limpo - Autor: Tio Bob - Ano: 2001
Basquete 101 - Autor: Hortência Marcari - Ano: 2010, estes livros devem, obrigatoriamente, estar rio através de um menu:
Retirar um livro: Dado a lista de livros que estão cadastrados no sistema, o usuário pode retirar qualquer livro desde que não esteja emprestado (ou seja, esteja disponível), e em caso de sucesso, ele fica indisponível.
Devolver um livro: Dado a lista de livros que o usuário retire livro ====================================
Livro selecionado: 
Número: 00002
Título: Código Limpo 
Autor: Tio Bob 


Ano: 2001
Status: Disponível
Emprestado para: 
Após a retirada:
Número: 00001
Título: Código Limpo 
Autor: Tio Bob 
Ano: 2001
Status: Indisponível
Emprestado para: Maria Antônia

Funcionalidade - Devolver um livro ==================================
Selecionar livro emprestado: 
Número: 00003
Título: Basquete 101
Autor: Hortência Marcari
Ano: 2010
Status: Indisponível
Emprestado para: João Pedro
Após a devolução:
Número: 00003
Título: Basquete 101
Autor: Hortência Marcari
Ano: 2010
Status: Disponível
Emprestado para: 

Funcionalidade - Doar um livro ==================================
Campos para preenchimento de um novo livro:
Número: 
Título: 
Autor: 
Ano: 
Status:
Emprestado para:
Após o cadastro:
Número: 00004
Título: Novo livro
Autor: Inês
Ano: 2000
Status: Disponível
Emprestado para: 
Extra: Seria muito legal se você conseguisse implementar uma maneira de armazenar as informações dos livros de forma que elas continuassem existindo mesmo após o usuário sair do sistema. Que funcionasse como uma espécie de “banco de dados”. ;)
