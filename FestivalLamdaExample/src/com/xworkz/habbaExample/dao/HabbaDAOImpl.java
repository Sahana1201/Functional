package com.xworkz.habbaExample.dao;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;

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

		List<HabbaDTO> temp = new ArrayList<HabbaDTO>();
		this.collection.forEach(d -> {
			if (dto.huduku(d)) {
				temp.add(d);
			}
		});
		return temp.get(0);
	}

	@Override
	public Collection<HabbaDTO> yalavanuHuduku(HabbaSearch search) {

		Collection<HabbaDTO> temp = new ArrayList<HabbaDTO>();

		this.collection.forEach(w -> {
			if (search.huduku(w)) {
				temp.add(w);
			}
		});
		return temp;
	}

}
