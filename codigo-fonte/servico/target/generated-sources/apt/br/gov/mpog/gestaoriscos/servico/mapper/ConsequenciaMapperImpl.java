package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Consequencia;

import br.gov.mpog.gestaoriscos.modelo.dto.ConsequenciaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class ConsequenciaMapperImpl implements ConsequenciaMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public ConsequenciaDTO consequenciaToConsequenciaDTO(Consequencia consequencia) {

        if ( consequencia == null ) {

            return null;
        }

        ConsequenciaDTO consequenciaDTO = new ConsequenciaDTO();

        consequenciaDTO.setId( consequencia.getId() );

        consequenciaDTO.setExcluido( consequencia.isExcluido() );

        consequenciaDTO.setDescricao( consequencia.getDescricao() );

        consequenciaDTO.setSearch( consequencia.getSearch() );

        consequenciaDTO.setStatus( consequencia.isStatus() );

        return consequenciaDTO;
    }

    @Override

    public List<ConsequenciaDTO> consequenciasToConsequenciaDTOs(List<Consequencia> consequencias) {

        if ( consequencias == null ) {

            return null;
        }

        List<ConsequenciaDTO> list = new ArrayList<ConsequenciaDTO>();

        for ( Consequencia consequencia : consequencias ) {

            list.add( consequenciaToConsequenciaDTO( consequencia ) );
        }

        return list;
    }

    @Override

    public Consequencia consequenciaDTOToConsequencia(ConsequenciaDTO consequenciaDTO) {

        if ( consequenciaDTO == null ) {

            return null;
        }

        Consequencia consequencia = new Consequencia();

        consequencia.setExcluido( consequenciaDTO.isExcluido() );

        consequencia.setDescricao( consequenciaDTO.getDescricao() );

        consequencia.setStatus( consequenciaDTO.isStatus() );

        consequencia.setSearch( consequenciaDTO.getSearch() );

        consequencia.setOrgao( orgaoMapper.orgaoDTOToOrgao( consequenciaDTO.getOrgao() ) );

        consequencia.setId( consequenciaDTO.getId() );

        return consequencia;
    }

    @Override

    public List<Consequencia> consequenciaDTOsToConsequencias(List<ConsequenciaDTO> consequenciaDTOs) {

        if ( consequenciaDTOs == null ) {

            return null;
        }

        List<Consequencia> list = new ArrayList<Consequencia>();

        for ( ConsequenciaDTO consequenciaDTO : consequenciaDTOs ) {

            list.add( consequenciaDTOToConsequencia( consequenciaDTO ) );
        }

        return list;
    }
}

