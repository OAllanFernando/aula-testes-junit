package imposto.renda;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class TesteImposto {

	@Test
	public void testaAliquotaZerada() throws IOException {
		System.out.println("Teste");

		double limiteA = 1903.98;
		double limiteInferiorA = 1903.97;
		double saidaExperadaLimiteA = 0;
		double saidaExperadaLimiteInferiorA = 0;
		double impostoLimiteA = SimuladorImpostoRenda.calcularImposto(limiteA);
		double impostoLimiteInferiorA = SimuladorImpostoRenda.calcularImposto(limiteInferiorA);
		assertEquals(saidaExperadaLimiteA, impostoLimiteA, 0.01);
		assertEquals(saidaExperadaLimiteInferiorA, impostoLimiteInferiorA, 0.01);

		double limiteB = 1903.99;
		double limiteSuperiorB = 1904.00;
		double saidaExperadaLimiteB = 0.0;
		double saidaExperadaLimiteSuperiorB = 0.02;
		double impostoLimiteB = SimuladorImpostoRenda.calcularImposto(limiteB);
		double impostoLimiteSuperiorB = SimuladorImpostoRenda.calcularImposto(limiteSuperiorB);
		assertEquals(saidaExperadaLimiteB, impostoLimiteB, 0.01);
		assertEquals(saidaExperadaLimiteSuperiorB, impostoLimiteSuperiorB, 0.02);

		double limiteC = 2826.65;
		double limiteInferiorC = 2826.64;
		double saidaEsperadaLimiteC = 69.20;
		double saidaEsperadaLimiteInferiorC = 69.1995;
		double impostoLimiteC = SimuladorImpostoRenda.calcularImposto(limiteC);
		double impostoLimiteInferiorC = SimuladorImpostoRenda.calcularImposto(limiteInferiorC);
		assertEquals(saidaEsperadaLimiteC, impostoLimiteC, 0.01);
		assertEquals(saidaEsperadaLimiteInferiorC, impostoLimiteInferiorC, 0.01);

		double limiteD = 2826.66;
		double limiteSuperiorD = 2826.67;
		double saidaEsperadaLimiteD = 69.20;
		double saidaEsperadaLimiteSuperiorD = 69.20;
		double impostoLimiteD = SimuladorImpostoRenda.calcularImposto(limiteD);
		double impostoLimiteInferiorD = SimuladorImpostoRenda.calcularImposto(limiteSuperiorD);
		assertEquals(saidaEsperadaLimiteD, impostoLimiteD, 0.01);
		assertEquals(saidaEsperadaLimiteSuperiorD, impostoLimiteInferiorD, 0.01);

		double limiteE = 3751.05;
		double limiteInferiorE = 3751.04;
		double saidaEsperadaLimiteE = 207.86;
		double saidaEsperadaLimiteInferiorE = 207.85;
		double impostoLimiteE = SimuladorImpostoRenda.calcularImposto(limiteE);
		double impostoLimiteInferiorE = SimuladorImpostoRenda.calcularImposto(limiteInferiorE);
		assertEquals(saidaEsperadaLimiteE, impostoLimiteE, 0.01);
		assertEquals(saidaEsperadaLimiteInferiorE, impostoLimiteInferiorE, 0.01);

		double limiteF = 3751.06;
		double limiteSuperiorF = 3751.07;
		double saidaEsperadaLimiteF = 207.86;
		double saidaEsperadaLimiteSuperiorF = 207.86;
		double impostoLimiteF = SimuladorImpostoRenda.calcularImposto(limiteF);
		double impostoLimiteInferiorF = SimuladorImpostoRenda.calcularImposto(limiteSuperiorF);
		assertEquals(saidaEsperadaLimiteF, impostoLimiteF, 0.01);
		assertEquals(saidaEsperadaLimiteSuperiorF, impostoLimiteInferiorF, 0.01);

		double limiteG = 4664.68;
		double limiteInferiorG = 4664.67;
		double saidaEsperadaLimiteG = 413.42;
		double saidaEsperadaLimiteInferiorG = 413.42;
		double impostoLimiteG = SimuladorImpostoRenda.calcularImposto(limiteG);
		double impostoLimiteInferiorG = SimuladorImpostoRenda.calcularImposto(limiteInferiorG);
		assertEquals(saidaEsperadaLimiteG, impostoLimiteG, 0.01);
		assertEquals(saidaEsperadaLimiteInferiorG, impostoLimiteInferiorG, 0.01);

		double limiteH = 4664.69;
		double limiteSuperiorH = 4664.70;
		double saidaEsperadaLimiteH = 413.42;
		double saidaEsperadaLimiteSuperiorH = 413.43;
		double impostoLimiteH = SimuladorImpostoRenda.calcularImposto(limiteG);
		double impostoLimiteInferiorH = SimuladorImpostoRenda.calcularImposto(limiteInferiorG);
		assertEquals(saidaEsperadaLimiteH, impostoLimiteH, 0.01);
		assertEquals(saidaEsperadaLimiteSuperiorH, impostoLimiteInferiorH, 0.01);

	}
}
