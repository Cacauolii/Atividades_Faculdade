# import -> incorpora uma biblioteca \
# (código já escrito para resolver algum problema específico)
import numpy as np

class Perceptron:
    # Declaração do construtor da classe
    def __init__(self):
        pass
    # Função de ativação Sigmoid e Degrau
    def sigmoid(self, x):
        return 1 / (1 + np.exp(-x))
    
    def step(self, x):
        return 1 if x >= 0 else 0

    def train(self, inputs, outputs, learning_rate=0.5, epochs=500, activation= 'sigmoid'):
        self.inputs = inputs
        self.outputs = outputs
        self.learning_rate = learning_rate
        self.epochs = epochs
        self.activation = activation

        # Inicialização de pesos iniciais de forma aleatória
        w1, w2, w3, bias = np.random.uniform(-1, 1), np.random.uniform(-1, 1), np.random.uniform(-1, 1), np.random.uniform(-1, 1)
        # w1 = np.random.uniform(-1, 1)
        # w2 = np.random.uniform(-1, 1)
        # bias = np.random.uniform(-1, 1)
    
        for i in range(epochs):
            for j in range(len(inputs)):
                # Soma ponderada dos inputs
                soma = (w1 * inputs[j][0]) + (w2 * inputs[j][1]) + (w3 * inputs[j][2]) + bias
                # Para escolher as funções de ativação
                if activation == 'sigmoid':
                    saida = self.sigmoid(soma)
                else:
                    saida = self.step(soma)
                # atualização dos pesos por iteração
                erro = outputs[j][0] - saida
                w1 += learning_rate * erro * inputs[j][0]
                w2 += learning_rate * erro * inputs[j][1]
                w3 += learning_rate * erro * inputs[j][2]
                bias += learning_rate * erro

        return w1, w2, w3, bias

    def predict(self, weights, x1, x2, x3, activation='sigmoid'):
        soma = (x1 * weights[0]) + (x2 * weights[1]) + (x3 * weights[2]) + weights[3]
        # Podemos usar FUNÇÃO DEGRAU OU FUNÇÃO SIGMOID
        # Sigmoid = deveolve um se o resultado for maior do que 0.5, senão 0
        if activation == 'sigmoid':
            return 1 if self.sigmoid(soma) > 0.5 else 0
        else:
            return self.step(soma)


if __name__ == '__main__':
    # Entradas das porta lógica AND
    inputs = [[0,0,0], [0,0,1], [0,1,0], [0,1,1], [1,0,0], [1,0,1], [1,1,0], [1,1,1]]
    outputs = [[0],[0],[0],[0],[0],[0],[0],[1]] # Saídas esperadas para a porta AND 
                              


    perceptron = Perceptron()
    
    # Podemos trocar de 'sigmoid' por 'step' para testar outra função de ativação
    pesos_treinados = perceptron.train(
        inputs=inputs,
        outputs=outputs,
        learning_rate=0.5,
        epochs=500,
        activation='sigmoid'
    )

    # Fazendo previsão testes
    print("Testando (1,1,1):", perceptron.predict(pesos_treinados, 1,1,1, activation='sigmoid'))
    print("Testando (1,1,0):", perceptron.predict(pesos_treinados, 1,1,0, activation='sigmoid'))


    ## O relátorio pedido pelo professor do que foi feito

    # Durante a atividade implementei um perceptron simples em Python e testei diferentes configurações.
    # Alterei a taxa de aprendizado e percebi que valores menores deixaram o treinamento mais estável, enquanto valores altos causavam oscilações.
    # Também aumentei o número de épocas e o perceptron passou a acertar melhor os resultados. 
    # Testei com as portas lógicas AND e OR, extraí a função de ativação para um método e troquei a sigmoid pela degrau para comparar.
    # Por fim, adaptei o código para trabalhar com três entradas e percebi que a porta AND com três valores exige mais épocas para aprender corretamente.
