# Cofrinho de Moedas

Este é um projeto simples em Java que simula um cofrinho de moedas. Foi desenvolvido como parte da atividade prática da disciplina de Programação Orientada a Objetos.

O objetivo principal é demonstrar o uso de conceitos fundamentais de POO, como **Herança** e **Polimorfismo**.

## Funcionalidades

O programa oferece um menu de console com as seguintes opções:
-   **Adicionar moedas:** Permite adicionar moedas de diferentes tipos (Dólar, Euro e Real) ao cofrinho.
-   **Remover moedas:** Permite remover uma moeda específica do cofrinho.
-   **Listar moedas:** Exibe todas as moedas atualmente no cofrinho.
-   **Calcular total:** Calcula e exibe o valor total de todas as moedas convertido para Real (BRL).

## Tecnologias e Conceitos Aplicados

-   **Linguagem:** Java
-   **Princípios de POO:** Herança, Polimorfismo, Encapsulamento.
-   **Estrutura de Dados:** `ArrayList` para armazenar a coleção de moedas.
-   **IDE Recomendada:** Eclipse ou IntelliJ IDEA.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:
-   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 8 ou superior).
-   Uma IDE Java, como [Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
-   [Git](https://git-scm.com/downloads).

## Como Executar o Projeto

Siga os passos abaixo para clonar e executar o projeto em sua IDE de preferência.

### 1. Clone o Repositório

Abra seu terminal ou Git Bash e execute o seguinte comando para clonar o projeto:
```bash
git clone git@github.com:fernandocarminatti/atividade_oop_cofrinho.git
```

### 2. Abra o Projeto na sua IDE

As instruções podem variar um pouco dependendo da IDE.

#### Para IntelliJ IDEA (Recomendado)

1.  Abra o IntelliJ IDEA.
2.  Na tela de boas-vindas, clique em **Open**.
3.  Navegue até o diretório onde você clonou o projeto e selecione a pasta.
4.  O IntelliJ irá detectar e configurar o projeto automaticamente.

#### Para Eclipse

1.  Abra o Eclipse.
2.  Vá em `File` -> `Import...`.
3.  Na janela de importação, expanda a pasta `General` e selecione **Existing Projects into Workspace**. Clique em **Next**.
4.  Clique em **Browse...** ao lado de "Select root directory" e navegue até a pasta onde você clonou o projeto.
5.  O projeto deverá aparecer na lista "Projects". Certifique-se de que ele está marcado e clique em **Finish**.

### 3. Execute o Programa

1.  Na sua IDE, navegue pela estrutura de pastas do projeto (geralmente em `src`).
2.  Encontre a classe principal, que contém o método `main`. De acordo com a especificação, ela deve se chamar `Principal.java`.
3.  Clique com o botão direito no arquivo `Principal.java`.
4.  Selecione a opção para executar:
    -   No **IntelliJ IDEA**: `Run 'Principal.main()'`.
    -   No **Eclipse**: `Run As` -> `Java Application`.

O menu interativo do programa será exibido no console da sua IDE. Siga as instruções na tela para usar o cofrinho.