package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Avaliacao.class)
public abstract class Avaliacao_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<Avaliacao, Processo> processo;
	public static volatile SingularAttribute<Avaliacao, Boolean> ignorarRiscoInerente;
	public static volatile SingularAttribute<Avaliacao, Long> id;

}

