# 🛡️ Lab Design Patterns: Security Monitoring API

Este projeto consolida o uso de **Padrões de Projeto (Design Patterns)** clássicos e modernos, aplicados ao ecossistema **Spring Boot**. A aplicação foi adaptada para um cenário real de **Monitoramento de Ocorrências de Segurança**, refletindo competências em arquitetura de software, automação e tratamento de incidentes.

## 🚀 Contexto do Desafio
O objetivo é gerenciar o ciclo de vida de ocorrências de segurança (como falhas de hardware ou eventos em postos de monitoramento). O sistema automatiza a geolocalização do incidente via CEP e aplica protocolos de resposta baseados na severidade do evento (Baixa ou Crítica), utilizando lógica desacoplada.

## 🧩 Padrões de Projeto Aplicados

*   **Singleton:** O Spring Framework gerencia instâncias de serviços (`@Service`) e repositórios (`@Repository`) como instâncias únicas por padrão.
*   **Strategy:** Implementado para definir diferentes protocolos de tratamento de ocorrências baseados na severidade, permitindo a expansão de regras sem alterar o código existente.
*   **Facade:** A implementação do serviço atua como uma fachada, abstraindo a complexidade de persistir dados no banco de dados e integrar-se com a API externa do ViaCEP.
*   **Proxy:** Utilizado através do **Spring Cloud OpenFeign** para realizar chamadas HTTP de forma transparente a serviços externos.

## 🛠️ Tecnologias Utilizadas
*   **Java 17**
*   **Spring Boot 3**
*   **Spring Data JPA**
*   **Spring Cloud OpenFeign**
*   **H2 Database** (Ambiente de desenvolvimento)
*   **Maven** (Gerenciamento de dependências)

## 📂 Estrutura de Classes
O diagrama abaixo ilustra a relação entre os componentes do sistema, focando na flexibilidade da implementação **Strategy**:

![Diagrama de Classes](docs/watermarked_img.png)


## 📖 Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Maike-Simoncini/lab-padroes-projeto-java.git
    ```
2.  **Compile o projeto:**
    Navegue até a pasta raiz e execute:
    ```bash
    mvn clean install
    ```
3.  **Rode a aplicação:**
    ```bash
    mvn spring-boot:run
    ```
4.  **Teste a API:**
    Envie um `POST` para `http://localhost:8080/ocorrencias` com o seguinte corpo JSON:
    ```json
    {
      "descricao": "Tentativa de furto de fiação externa",
      "severidade": "CRITICA",
      "cep": "37200000"
    }
    ```

---

### 👨‍💻 Sobre o Autor
**Maike Simoncini da Silva**
*   Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS).
*   Experiência como Operador de Monitoramento de sistemas de segurança eletrônica.
*   Em transição de carreira para Engenharia de IA e Cybersecurity.
*   Proficiente em Python para automação e manipulação de dados.
