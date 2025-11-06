# Atividades_Faculdade
 Aqui fica todos os exercícios

----------------------------------------------------------------

 # Atividade_perceptron

  Respostas:

   1 - O Perceptron foi o primeiro modelo de rede neural, criado para imitar o neurônio humano de forma simples. Ele pega entradas, multiplica por pesos, soma tudo com um bias e decide se ativa ou não. Foi importante para dar entrada em um mundo de automatização muito maior do que eramos.

   2 - Ser um classificador linear significa que o Perceptron só consegue separar os dados com linhas ou planos retos. A limitação é que ele não resolve problemas mais complexos.

   3 - Ele calcula a soma dos inputs, soma o bias e decide a saída (0 ou 1) com base nessa soma e faz a impressão do seu resultado no final.

   4 - Um exemplo seria identificar se um e-mail é spam ou não. É simples, rápido e resolve bem problemas que podem ser separados de forma linear.

-----------------------------------------------------------------


# Atividade_MLP

 Resposta:

  - Primeiro, importamos a biblioteca numpy e criamos a classe MLP, deixando os pesos e os bias iniciados como None.
    Depois, fizemos a função de treinamento do algoritmo e colocamos os valores nas variáveis. Em seguida, criamos os laços de repetição para treinar o modelo com os dados de entrada. É nessa parte que acontecem os cálculos para conseguir os valores que vão ser usados nos testes.
    Logo depois, fizemos a parte de teste com a função predict e definimos a função de ativação como sigmoid.
    Por fim, testamos nosso perceptron usando a tabela verdade do XOR e executamos o treinamento para ver o resultado.
