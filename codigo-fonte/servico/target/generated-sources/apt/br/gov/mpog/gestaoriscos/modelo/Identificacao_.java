package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Identificacao.class)
public abstract class Identificacao_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<Identificacao, Processo> processo;
	public static volatile ListAttribute<Identificacao, EventoRisco> eventos;
	public static volatile SingularAttribute<Identificacao, Long> id;

}

