package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Analise.class)
public abstract class Analise_ extends br.gov.mpog.gestaoriscos.modelo.base.AnaliseBase_ {

	public static volatile SingularAttribute<Analise, Orgao> orgao;
	public static volatile SingularAttribute<Analise, Processo> processo;
	public static volatile ListAttribute<Analise, MatrizSwot> matrizes;
	public static volatile SingularAttribute<Analise, Orgao> secretaria;

}

