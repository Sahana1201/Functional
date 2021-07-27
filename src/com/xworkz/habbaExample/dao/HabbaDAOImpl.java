package com.xworkz.habbaExample.dao;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

import com.xworkz.habbaExample.dto.HabbaDTO;
import com.xworkz.habbaExample.search.HabbaSearch;

public class HabbaDAOImpl implements HabbaDAO {

	private Collection<HabbaDTO> collection = new ArrayList<HabbaDTO>();

	@Override
	public boolean save(HabbaDTO dto) {
		boolean add = collection.add(dto);
		System.out.println(dto);

		return add;

	}

	@Override
	public HabbaDTO ondunsHuduku(HabbaSearch dto) {

		Iterator<HabbaDTO> iterator = this.collection.iterator();
		HabbaDTO temp = null;
		while (iterator.hasNext()) {
			HabbaDTO habbadto = iterator.next();
			if (dto.huduku(habbadto)) {

				temp = habbadto;
				break;
			}
		}

		return temp;
	}

	@Override
	public Collection<HabbaDTO> yalavanuHuduku(HabbaSearch search) {

		Collection<HabbaDTO> temp = new ArrayList<HabbaDTO>();
		Iterator<HabbaDTO> itr = this.collection.iterator();

		while (itr.hasNext()) {
			HabbaDTO habbaDTO = itr.next();
			if (search.huduku(habbaDTO)) {
				temp.add(habbaDTO);
			}
		}
		return temp;
	}
}
