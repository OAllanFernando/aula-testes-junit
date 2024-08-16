# JUNIT

Projeto prático em testes.

Utilizando uma aplicação de calculo de imposto de renda( Inserido JAR na raiz ). Realizo testes de caixa preta utilizando análise de valor limite, técnica de teste que valida valores superiores e inferiores aos particionamentos de equivalencia.

Defino aqui os valores a serem calculados, dados pelo enunciado e em sequencia seu limite superior, neste caso, o limite inferior é feito em outra partição, e por convenção não repetimos teste.

    double limiteD = 2826.66;
    double limiteSuperiorD = 2826.67;

Atrávez do site ...
Verifico o valor do imposto para o valor do enunciado,
defino como resultado esperado e defino aqui o resultado esperado.

    double saidaEsperadaLimiteD = 69.20;
    double saidaEsperadaLimiteSuperiorD = 69.20;

Utilizo o metodo da aplicação testada para calcular o imposto, salvando o retorno.

    double impostoLimiteD = SimuladorImpostoRenda.calcularImposto(limiteD);
	double impostoLimiteInferiorD = SimuladorImpostoRenda.calcularImposto(limiteSuperiorD);

Através do assertEquals, metodo do junit que compara valores, com tolerancia de 0.01 certifico o resultado da aplicação.

		assertEquals(saidaEsperadaLimiteD, impostoLimiteD, 0.01);
		assertEquals(saidaEsperadaLimiteSuperiorD, impostoLimiteInferiorD, 0.01);
