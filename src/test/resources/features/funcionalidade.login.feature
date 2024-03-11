
@regressivoLogin
Feature: Login
  COMO usuario do site Orange
  QUERO efetuar login
  PARA acessar todas as funcionalidades disponiveis do site
  
  Background: Configuracao inicial
           Given que eu esteja na tela de login "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  @positivo
  Scenario: Login com sucesso   
    When informar os dados validos
    And clicar no botao login 
    Then login efetuado com sucesso direcionando para tela de usuario logado 
    
 
 @negativo 
 Scenario: Login usuario errado
    When informar usuario errado
    But informar a senha correta
    And clicar no botao login
    Then aparece mensagem Invalid credentials
  
    

  