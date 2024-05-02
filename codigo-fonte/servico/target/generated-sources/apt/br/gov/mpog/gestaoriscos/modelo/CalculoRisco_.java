package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CalculoRisco.class)
public abstract class CalculoRisco_ extends br.gov.mpog.gestaoriscos.modelo.base.CalculoRiscoBase_ {

	public static volatile SingularAttribute<CalculoRisco, EventoRisco> eventoRisco;
	public static volatile ListAttribute<CalculoRisco, PesoEventoRisco> pesos;

}

