# Polimorfismo-Classes-Abstratas-e-Heran-a, em Java
Estudo prática sobre Polimorfismo, Classes Abstratas e Herança

Exercício retirado de https://sites.google.com/a/iftm.edu.br/professor-edson-angoti-junior/programacao-orientada-a-objetos---curso-licenciatura-em-computacao-2011-2/exercicios_classe_abstrata

Escreva uma classe abstrata chamada CartaoWeb. Essa classe representa todos os tipos de cartões web e conterá apenas um atributo: destinatario (tipo String). Nessa classe você deverá também declarar o método public abstract void showMessage(). Crie classes filhas da classe CartaoWeb: DiaDosNamorados, Natal, Aniversario. 

Cada uma dessas classes deve conter um método construtor que receba o nome do destinatário do cartão. Cada classe também deve implementar o método showMessage(), mostrando uma mensagem ao usuário com seu nome e que seja específica para a data de comemorativa do cartão. 

Escreva um programa e no método main crie um array de CartaoWeb. Insira instâncias dos 3 tipos de cartões neste array. Após, use um laço for para exibir as mensagens deste cartão chamando o método showMessage().Em que linha(s) acontece polimorfismo nesse código?
