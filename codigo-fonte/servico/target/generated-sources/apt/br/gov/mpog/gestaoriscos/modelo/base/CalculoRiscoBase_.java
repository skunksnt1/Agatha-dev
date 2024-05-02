package br.gov.mpog.gestaoriscos.modelo.base;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CalculoRiscoBase.class)
public abstract class CalculoRiscoBase_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<CalculoRiscoBase, BigDecimal> mediaPeso;
	public static volatile SingularAttribute<CalculoRiscoBase, Integer> frequencia;
	public static volatile SingularAttribute<CalculoRiscoBase, Long> id;
	public static volatile SingularAttribute<CalculoRiscoBase, BigDecimal> nivel;

}

