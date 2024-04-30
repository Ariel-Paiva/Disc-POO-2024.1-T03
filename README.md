# Trabalho 03 da Disciplina de POO 2024.1
<div>
  <img src="https://user-images.githubusercontent.com/25181517/192108892-6e9b5cdf-4e35-4a70-ad9a-801a93a07c1c.png" height="48" width="48">
  <img src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" height="48" width="48">
</div>

## Equipe "Os Nobres"
- [Ariel Paiva](https://github.com/Ariel-Paiva)
- [Gabriel Alencar](https://github.com/Bilinhas)
- [Ismael Nascimento](https://github.com/ismaelnascimento)
- [João Gabriel Aguiar](https://github.com/Jot4g3)
- [Kauã Sousa](https://github.com/kkauaon)
  
## Repositório
Neste repositório, há as soluções dos exercícios resolvidos (25+25) do Capítulo 6 (Vetor) e 8 (Sub-rotina) do livro "Fundamentos da Programação de Computadores".

Esses exercícios compõem o Trabalho 03 da disciplina de Programação Orientada a Objetos no semestre 2024.1 com o professor [Roger Sarmento](https://github.com/rogermsarmento)

### Questões feitas (clique para ver)
<details>
  <summary>Capítulo 06 - Exercícios resolvidos</summary>

|Questão|Enunciado|
|-------|---------|
|1|Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.|
|2|Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas. O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre: um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final, deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).|
|3|Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.|
|4|Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.|
|5|Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre os seguintes vetores resultantes: união de X e Y; diferença de X e Y; soma de X e Y; produto de X e Y; e interseção de X e Y.|
|6|Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resultante de uma ordenação decrescente.|
|7|Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene de forma crescente.|
|8|Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-os de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições, composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira crescente.|
|9|Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um menu com as seguintes opções: consultar; efetuar reserva; e sair. Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes opções: por número do voo; por origem; e por destino. Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pessoa deseja viajar. O programa deverá dar as seguintes respostas: reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis; voo lotado — caso não exista lugar disponível nesse voo; voo inexistente — caso o código do voo não exista. A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação de consulta ou reserva, o programa volta ao menu principal.|
|10|Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados. Calcule e mostre: o número e a nota de cada aluno; e a porcentagem de aprovação, sabendo-se que a nota mínima é 6.|
|11|Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor. Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro...). Desconsidere empates.|
|12|Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca, Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível. Calcule e mostre: o modelo de carro mais econômico; e quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1.000 km.|
|13|Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números superiores a cinquenta e suas respectivas posições. O programa deverá mostrar mensagem se não existir nenhum número nessa condição.|
|14|Faça um programa que preencha três vetores com cinco posições cada. O primeiro vetor receberá os nomes de cinco funcionários; o segundo e o terceiro vetor receberão, respectivamente, o salário e o tempo de serviço de cada um. Mostre um primeiro relatório apenas com os nomes dos funcionários que não terão aumento; mostre um segundo relatório apenas com os nomes e os novos salários dos funcionários que terão aumento. Sabe-se que os funcionários que terão direito ao aumento são aqueles que possuem tempo de serviço superior a cinco anos ou salário inferior a R$ 800,00. Sabe-se, ainda, que, se o funcionário satisfizer às duas condições anteriores, tempo de serviço e salário, o aumento será de 35%; para o funcionário que satisfazer apenas à condição tempo de serviço, o aumento será de 25%; para aquele que satisfazer apenas à condição salário, o aumento será de 15%.|
|15|Faça um programa que preencha um primeiro vetor com dez números inteiros, e um segundo vetor com cinco números inteiros. O programa deverá mostrar uma lista dos números do primeiro vetor com seus respectivos divisores armazenados no segundo vetor, bem como suas posições.|
|17|Faça um programa que receba seis números inteiros e mostre: os números pares digitados; a soma dos números pares digitados; os números ímpares digitados; e a quantidade de números ímpares digitados.|
|18|Faça um programa que receba o número sorteado por um dado em vinte jogadas. Mostre os números sorteados e a frequência com que apareceram.|
|19|Faça um programa que preencha dois vetores, A e B, com vinte caracteres cada. A seguir, troque o 1º elemento de A com o 20º de B, o 2º de A com o 19º de B, e assim por diante, até trocar o 20º de A com o 1º de B. Mostre os vetores antes e depois da troca.|
|20|Faça um programa que leia um vetor com cinco posições para números reais e, depois, um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.|
|22|Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o seguinte menu na tela: 1. Efetuar depósito 2. Efetuar saque 3. Consultar o ativo bancário, ou seja, o somatório dos saldos de todos os clientes 4. Finalizar o programa. Para efetuar depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, atualizar seu saldo; para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, verificar se o seu saldo é suficiente para cobrir o saque. (Estamos supondo que a conta não possa ficar com o saldo negativo.) Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário, mostrar a mensagem Saldo insuficiente e voltar ao menu; para consultar o ativo bancário, deve-se somar o saldo de todas as contas do banco. Depois de mostrar esse valor, voltar ao menu; o programa só termina quando for digitada a opção 4 — Finalizar o programa.|
|23|Uma empresa possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um programa que utilize dois vetores para controlar as poltronas ocupadas no corredor e na janela. Considere que 0 representa poltrona desocupada e 1, poltrona ocupada.|
|24|Faça um programa que leia um vetor A de dez posições contendo números inteiros. Determine e mostre, a seguir, quais elementos de A estão repetidos e quantas vezes cada um se repete.|
|25|Faça um programa que gere os dez primeiros números primos acima de 100 e armazene-os em um vetor. Escreva no final o vetor resultante.|

</details>

<details>
  <summary>Capítulo 08 - Exercícios resolvidos</summary>

|Questão|Enunciado|
|-------|---------|
|1|Faça um programa contendo uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se for negativo.|
|2|Faça um programa contendo uma sub-rotina que receba dois números positivos por parâmetro e retorne a soma dos N números inteiros existentes entre eles.|
|3|Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e c) e retornar o resultado para ser impresso.|
|4|Faça uma sub-rotina que receba um único valor representando segundos. Essa sub-rotina deverá convertê-lo para horas, minutos e segundos. Todas as variáveis devem ser passadas como parâmetro, não havendo variáveis globais.|
|5|Crie um programa que receba os valores antigo e atual de um produto. Chame uma sub-rotina que determine o percentual de acréscimo entre esses valores. O resultado deverá ser mostrado no programa principal.|
|6|Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9 e mostre a seguinte tabela de multiplicação.|
|7|Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.|
|8|Crie uma sub-rotina que receba como parâmetro a hora de início e a hora de término de um jogo, ambas subdivididas em dois valores distintos: horas e minutos. A sub-rotina deverá retornar a duração expressa em minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que ele pode começar em um dia e terminar no outro.|
|9|Faça uma sub-rotina que leia cinco valores inteiros, determine e mostre o maior e o menor deles.|
|10|Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S, obtido pelo seguinte cálculo: S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!|
|11|Foi realizada uma pesquisa sobre algumas características físicas de cinco habitantes de uma região. Foram coletados os seguintes dados de cada habitante: sexo, cor dos olhos (A — azuis; ou C — castanhos), cor dos cabelos (L — louros; P — pretos; ou C — castanhos) e idade. Faça um programa que apresente as sub-rotinas a seguir: Que leia esses dados, armazenando-os em vetores. Que determine e devolva ao programa principal a média de idade das pessoas com olhos castanhos e cabelos pretos. Que determine e devolva ao programa principal a maior idade entre os habitantes. Que determine e devolva ao programa principal a quantidade de indivíduos do sexo feminino com idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros.|
|12|Elabore uma sub-rotina que retorne um vetor com os três primeiros números perfeitos. Sabe-se que um número é perfeito quando é igual à soma de seus divisores (exceto ele mesmo). Exemplo: os divisores de 6 são 1, 2 e 3, e 1 + 2 + 3 = 6, logo 6 é perfeito.|
|13|Faça uma sub-rotina que receba um vetor A de dez elementos inteiros como parâmetro. Ao final dessa função, deverá ter sido gerado um vetor B contendo o fatorial de cada elemento de A. O vetor B deverá ser mostrado no programa principal.|
|14|Crie uma sub-rotina que receba como parâmetro dois vetores de dez elementos inteiros positivos e mostre o vetor união dos dois primeiros.|
|15|Faça uma sub-rotina que receba como parâmetro um vetor A com cinco números reais e retorne esses números ordenados de forma crescente.|
|17|Faça uma sub-rotina que receba como parâmetro uma matriz A(5,5) e retorne a soma de seus elementos.|
|18|Crie uma sub-rotina que receba como parâmetro uma matriz A(6,6) e retorne o menor elemento de sua diagonal secundária.|
|19|Elabore uma sub-rotina que receba como parâmetro uma matriz A(6,6) e multiplique cada linha pelo elemento da diagonal principal da linha. A sub-rotina deverá retornar a matriz alterada para ser mostrada no programa principal.|
|20|Crie uma sub-rotina que receba como parâmetro uma matriz A(12,12) e retorne a média aritmética dos elementos abaixo da diagonal principal.|
|22|Crie um programa que carregue um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deverá conter os números positivos e o segundo, os números negativos. Cada vetor resultante terá no máximo oito posições, e nem todas serão obrigatoriamente utilizadas.|
|23|Crie um programa que carregue uma matriz 3X4 com números reais. Utilize uma função para copiar todos os valores da matriz para um vetor de 12 posições. Esse vetor deverá ser mostrado no programa principal.|
|24|Faça um programa contendo uma sub-rotina que receba dois valores numéricos e um símbolo. Esse símbolo representará a operação que se deseja efetuar com os números. Se o símbolo for +, deverá ser realizada uma adição, e, se for *, deverá ser efetuada uma multiplicação. O resultado deverá ser mostrado no programa principal.|
|25|Crie uma sub-rotina que receba como parâmetro um vetor A de 25 números inteiros e substitua todos os valores negativos de A por zero. O vetor resultante deverá ser mostrado no programa principal.|

</details>
