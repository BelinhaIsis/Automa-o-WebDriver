Feature : Incluir Movimentação

	Brackground: Nova movimentação

	Cenário:
	Dado que estou em Movimentação
	E clico em nova movimentação
	E seleciono o <tipo>
	E digito o <valor>
	E digito os <itens>
	Então apresenta <mensagem>

	tipo      valor   itens    mansagem

	Entrada    10     copo      Sucesso ao inserir a movimentação
	Saída      10     pratos    Sucesso ao inserir a movimentação
	Saída      ""     ""        Por favor, preencha os campos obrigatórios!
 