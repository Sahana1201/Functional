package com.xworkz.habbaExample.dao;

import java.util.Collection;

import com.xworkz.habbaExample.dto.HabbaDTO;
import com.xworkz.habbaExample.search.HabbaSearch;

public interface HabbaDAO {
	HabbaDTO ondunsHuduku(HabbaSearch dto);

	Collection<HabbaDTO> yalavanuHuduku(HabbaSearch search);

	boolean save(HabbaDTO dto);
}
