#Author: aliissonbs09@gmail.com


Feature: Validar Fluxo de Compra


  @tag1
  Scenario: Buscar produto e finalizar compra
  Given que o usuario acesse o "https://ze.delivery/"
  And Realize o login
  When Realizar a busca pela marca " Skol 269"
  And selecionar o produto
  And Selecionar a quantidade
  And Selecionar o botao Continuar compra
  And selecionar o botao Forma de pagamento
  And selecionar o pagamento desejado
  And Selecionar finalizar Compra
  Then valido o botao desfazer Pedido
 