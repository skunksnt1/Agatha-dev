package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.DecisaoProcesso;

import br.gov.mpog.gestaoriscos.modelo.dto.DecisaoProcessoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class DecisaoProcessoMapperImpl implements DecisaoProcessoMapper {

    @Override

    public DecisaoProcessoDTO decisaoProcessoToDecisaoProcessoDTO(DecisaoProcesso decisaoProcesso) {

        if ( decisaoProcesso == null ) {

            return null;
        }

        DecisaoProcessoDTO decisaoProcessoDTO = new DecisaoProcessoDTO();

        decisaoProcessoDTO.setId( decisaoProcesso.getId() );

        decisaoProcessoDTO.setExcluido( decisaoProcesso.isExcluido() );

        decisaoProcessoDTO.setNome( decisaoProcesso.getNome() );

        return decisaoProcessoDTO;
    }

    @Override

    public List<DecisaoProcessoDTO> decisaoProcessosToDecisaoProcessoDTOs(List<DecisaoProcesso> decisaoProcessos) {

        if ( decisaoProcessos == null ) {

            return null;
        }

        List<DecisaoProcessoDTO> list = new ArrayList<DecisaoProcessoDTO>();

        for ( DecisaoProcesso decisaoProcesso : decisaoProcessos ) {

            list.add( decisaoProcessoToDecisaoProcessoDTO( decisaoProcesso ) );
        }

        return list;
    }

    @Override

    public DecisaoProcesso decisaoProcessoDTOToDecisaoProcesso(DecisaoProcessoDTO decisaoProcessoDTO) {

        if ( decisaoProcessoDTO == null ) {

            return null;
        }

        DecisaoProcesso decisaoProcesso = new DecisaoProcesso();

        decisaoProcesso.setExcluido( decisaoProcessoDTO.isExcluido() );

        decisaoProcesso.setNome( decisaoProcessoDTO.getNome() );

        decisaoProcesso.setId( decisaoProcessoDTO.getId() );

        return decisaoProcesso;
    }

    @Override

    public List<DecisaoProcesso> decisaoProcessoDTOsToDecisaoProcessos(List<DecisaoProcessoDTO> decisaoProcessoDTOs) {

        if ( decisaoProcessoDTOs == null ) {

            return null;
        }

        List<DecisaoProcesso> list = new ArrayList<DecisaoProcesso>();

        for ( DecisaoProcessoDTO decisaoProcessoDTO : decisaoProcessoDTOs ) {

            list.add( decisaoProcessoDTOToDecisaoProcesso( decisaoProcessoDTO ) );
        }

        return list;
    }
}

