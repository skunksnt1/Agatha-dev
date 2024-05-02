package br.gov.mpog.gestaoriscos.modelo.base;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ArquivoAnexoBase.class)
public abstract class ArquivoAnexoBase_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<ArquivoAnexoBase, Integer> tamanho;
	public static volatile SingularAttribute<ArquivoAnexoBase, String> nomeArquivo;
	public static volatile SingularAttribute<ArquivoAnexoBase, String> nomeDocumento;
	public static volatile SingularAttribute<ArquivoAnexoBase, Date> dataUpload;
	public static volatile SingularAttribute<ArquivoAnexoBase, Long> id;

}

