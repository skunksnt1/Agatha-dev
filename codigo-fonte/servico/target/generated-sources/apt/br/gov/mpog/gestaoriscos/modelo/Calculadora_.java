package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Calculadora.class)
public abstract class Calculadora_ {

	public static volatile SingularAttribute<Calculadora, Boolean> excluido;
	public static volatile SingularAttribute<Calculadora, Boolean> calculadoraBase;
	public static volatile ListAttribute<Calculadora, ProbabilidadeCalculadora> probabilidades;
	public static volatile SingularAttribute<Calculadora, Long> id;
	public static volatile ListAttribute<Calculadora, ImpactoCalculadora> impactos;

}

