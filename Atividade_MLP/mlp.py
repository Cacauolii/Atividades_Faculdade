import numpy as np

class MLP:
    def __init__(self):
        # Inicializa os pesos e bias como None
        self.w11 = None
        self.w12 = None
        self.w21 = None
        self.w22 = None
        self.wh1 = None
        self.wh2 = None
        self.b1 = None
        self.b2 = None
        self.b3 = None

    def train(self, inputs, outputs, alpha, epochs):
        # Inicializa pesos e bias aleatoriamente
        self.w11 = np.random.uniform(0, 1)
        self.w12 = np.random.uniform(0, 1)
        self.w21 = np.random.uniform(0, 1)
        self.w22 = np.random.uniform(0, 1)
        self.wh1 = np.random.uniform(0, 1)
        self.wh2 = np.random.uniform(0, 1)
        self.b1 = np.random.uniform(0, 1)
        self.b2 = np.random.uniform(0, 1)
        self.b3 = np.random.uniform(0, 1)

        for i in range(epochs):
            for j in range(len(inputs)):
                h1 = 1 / (1 + np.exp(- ((inputs[j][0] * self.w11) + (inputs[j][1] * self.w21) + self.b1)))
                h2 = 1 / (1 + np.exp(- ((inputs[j][0] * self.w12) + (inputs[j][1] * self.w22) + self.b2)))

                y = 1 / (1 + np.exp(- ((h1 * self.wh1) + (h2 * self.wh2) + self.b3)))

                error = outputs[j][0] - y

                derivative_y = y * (1 - y) * error
                derivative_h1 = h1 * (1 - h1) * self.wh1 * derivative_y
                derivative_h2 = h2 * (1 - h2) * self.wh2 * derivative_y

                delta_w11 = alpha * derivative_h1 * inputs[j][0]
                delta_w12 = alpha * derivative_h2 * inputs[j][0]
                delta_w21 = alpha * derivative_h1 * inputs[j][1]
                delta_w22 = alpha * derivative_h2 * inputs[j][1]

                delta_b1 = alpha * derivative_h1
                delta_b2 = alpha * derivative_h2
                delta_b3 = alpha * derivative_y

                delta_wh1 = alpha * derivative_y * h1
                delta_wh2 = alpha * derivative_y * h2

                # Atualiza os pesos e bias
                self.w11 += delta_w11
                self.w12 += delta_w12
                self.w21 += delta_w21
                self.w22 += delta_w22

                self.wh1 += delta_wh1
                self.wh2 += delta_wh2

                self.b1 += delta_b1
                self.b2 += delta_b2
                self.b3 += delta_b3

    def predict(self, x1, x2):
        hidden1 = 1 / (1 + np.exp(- ((x1 * self.w11) + (x2 * self.w21) + self.b1)))
        hidden2 = 1 / (1 + np.exp(- ((x1 * self.w12) + (x2 * self.w22) + self.b2)))
        output = 1 / (1 + np.exp(- ((hidden1 * self.wh1) + (hidden2 * self.wh2) + self.b3)))
        return 1 if output > 0.5 else 0

# Entradas e saídas baseadas na porta XOR
inputs = [[0, 0], [0, 1], [1, 0], [1, 1]]
outputs = [[0], [1], [1], [0]]

mlp = MLP()
mlp.train(inputs, outputs, 0.005, 10000)
y = mlp.predict(1, 1)
print(y)
