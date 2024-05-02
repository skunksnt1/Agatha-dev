package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Causa;

import br.gov.mpog.gestaoriscos.modelo.dto.CausaDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class CausaMapperImpl implements CausaMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public CausaDTO causaToCausaDTO(Causa causa) {

        if ( causa == null ) {

            return null;
        }

        CausaDTO causaDTO = new CausaDTO();

        causaDTO.setId( causa.getId() );

        causaDTO.setExcluido( causa.isExcluido() );

        causaDTO.setDescricao( causa.getDescricao() );

        causaDTO.setSearch( causa.getSearch() );

        causaDTO.setStatus( causa.isStatus() );

        return causaDTO;
    }

    @Override

    public List<CausaDTO> causasToCausaDTOs(List<Causa> causas) {

        if ( causas == null ) {

            return null;
        }

        List<CausaDTO> list = new ArrayList<CausaDTO>();

        for ( Causa causa : causas ) {

            list.add( causaToCausaDTO( causa ) );
        }

        return list;
    }

    @Override

    public Causa causaDTOToCausa(CausaDTO causaDTO) {

        if ( causaDTO == null ) {

            return null;
        }

        Causa causa = new Causa();

        causa.setExcluido( causaDTO.isExcluido() );

        causa.setDescricao( causaDTO.getDescricao() );

        causa.setStatus( causaDTO.isStatus() );

        causa.setSearch( causaDTO.getSearch() );

        causa.setOrgao( orgaoMapper.orgaoDTOToOrgao( causaDTO.getOrgao() ) );

        causa.setId( causaDTO.getId() );

        return causa;
    }

    @Override

    public List<Causa> causaDTOsToCausas(List<CausaDTO> causaDTOs) {

        if ( causaDTOs == null ) {

            return null;
        }

        List<Causa> list = new ArrayList<Causa>();

        for ( CausaDTO causaDTO : causaDTOs ) {

            list.add( causaDTOToCausa( causaDTO ) );
        }

        return list;
    }
}

