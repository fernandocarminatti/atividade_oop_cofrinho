# Cofrinho de Moedas

Este é um projeto simples em Java que simula um cofrinho de moedas. Foi desenvolvido como parte da atividade prática da disciplina de Programação Orientada a Objetos.

O objetivo principal é demonstrar o uso de conceitos fundamentais de POO, como **Herança** e **Polimorfismo**.

## Estrutura do Projeto

O código-fonte está localizado na pasta `src` e está organizado nos seguintes pacotes:

-   `app`: Contém as classes responsáveis pela execução e interface com o usuário (`Main.java`, `Menu.java`).
-   `model`: Contém as classes que representam a lógica de negócio do cofrinho (`Cofrinho.java`, `Moeda.java`, e suas subclasses `Dolar`, `Euro`, e `Real`).

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

## Pré-requisitos

-   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 8 ou superior).

---

## Como Executar o Projeto

Para executar, primeiro descompacte o arquivo `.zip` em uma pasta de sua escolha. Existem duas maneiras de executar o projeto:

### Opção 1: Executando em um IDE (Recomendado)

Este é o método mais simples. O projeto não possui dependências externas.

#### Para IntelliJ IDEA:
1.  Na tela de boas-vindas, clique em **Open**.
2.  Navegue e selecione a pasta do projeto que você descompactou. O IntelliJ irá configurar o projeto automaticamente.
3.  Localize o arquivo `Main.java` dentro de `src/app`.
4.  Clique com o botão direito no arquivo e selecione **"Run 'Main.main()'"**.

#### Para Eclipse:
1.  Vá em `File` -> `Import...`.
2.  Selecione `General` -> `Existing Projects into Workspace` e clique em `Next`.
3.  Clique em `Browse...` ao lado de "Select root directory" e navegue até a pasta do projeto.
4.  Clique em `Finish`.
5.  Localize o arquivo `Main.java` dentro de `src/app` no *Package Explorer*.
6.  Clique com o botão direito no arquivo e selecione **`Run As` > `Java Application`**.

### Opção 2: Executando pela Linha de Comando (Universal)

Este método funciona em qualquer sistema com JDK instalado e garante a execução sem depender de um IDE.

1.  Abra um terminal (ou Prompt de Comando) e navegue até a pasta principal do projeto (a pasta que contém o diretório `src`).
2.  **Compile o código:**
    Execute o comando abaixo. Ele criará uma pasta `bin` para os arquivos compilados (`.class`).

    *Para Linux/macOS:*
    ```bash
    javac -d bin src/app/*.java src/model/*.java
    ```

    *Para Windows:*
    ```bash
    javac -d bin src\app\*.java src\model\*.java
    ```

3.  **Execute o programa:**
    Após a compilação bem-sucedida, execute o comando a seguir. Ele informa ao Java para usar a pasta `bin` como classpath (`-cp`) e executar a classe `Main` do pacote `app`.

    ```bash
    java -cp bin app.Main
    ```

O menu interativo do cofrinho será exibido no seu terminal.