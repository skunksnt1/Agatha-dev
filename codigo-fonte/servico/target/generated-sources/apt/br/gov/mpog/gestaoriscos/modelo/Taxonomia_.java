package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Taxonomia.class)
public abstract class Taxonomia_ extends br.gov.mpog.gestaoriscos.modelo.base.TaxonomiaBase_ {

	public static volatile SingularAttribute<Taxonomia, AgrupamentoTaxonomia> agrupamento;
	public static volatile SingularAttribute<Taxonomia, TipoTaxonomia> tipo;
	public static volatile SingularAttribute<Taxonomia, Evento> evento;
	public static volatile SingularAttribute<Taxonomia, Orgao> orgao;
	public static volatile SingularAttribute<Taxonomia, Consequencia> consequencia;
	public static volatile SingularAttribute<Taxonomia, Causa> causa;
	public static volatile SingularAttribute<Taxonomia, Controle> controle;
	public static volatile SingularAttribute<Taxonomia, StatusTaxonomia> status;

}

