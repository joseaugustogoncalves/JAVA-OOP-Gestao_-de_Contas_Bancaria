# JAVA-OOP-Gestao_-de_Contas_Bancaria
## Gestão de Contas Bancárias (instanciação, herança, variáveis de instância e de classe)

### Título
Gestão de Contas Bancárias: herança, instanciação, variáveis de instância e de classe

### Objetivo
Implementar um pequeno sistema bancário com duas subclasses de Conta (ContaCorrente e ContaPoupanca) de forma a praticar instanciação, herança, override de métodos e variáveis de classe (static).

### Regras
Cada conta tem titular (String), saldo (double) e um contador de contas (variável de classe static int totalContas) que incrementa em cada nova instância criada.

ContaCorrente cobra taxa mensal (fixa + percentual).
ContaPoupanca aplica juros mensais.

Deve existir um método polimórfico atualizarMensal() que cada subclasse implementa de forma diferente.

Implementar operações: depositar, levantar (com validação) e transferir.

### Tarefas

Completar as classes com os TODOs.
Garantir que totalContas reflete corretamente o número de instâncias.

Implementar override de atualizarMensal() nas subclasses.
Escrever testes (ou completar os existentes) para:

criação de contas e incremento de totalContas;
depósito, levantamento, transferência;
comportamento polimórfico de atualizarMensal().

### Resumo
1. Validar argumentos nos construtores e métodos (valor > 0, saldo suficiente, titular não vazio).
2. Implementar corretamente totalContas.
3. Implementar levantar, transferir retornando boolean.
4. Implementar atualizarMensal() nas duas subclasses.
5. Garantir que os testes passam.
