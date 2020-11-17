package com.finger.uebung.service;

import com.finger.uebung.dao.DaoEntity;
import com.finger.uebung.entities.GitMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitMemberService {

    private DaoEntity daoMember;

    @Autowired
    public GitMemberService(DaoEntity daoMember){
        this.daoMember = daoMember;
    }

    public List<GitMember> getAllGitMembers(){

        return daoMember.getAllGitMembers();
    }

    public GitMember getGitMemberByName(String fullName){
        return daoMember.getGitMemberByName(fullName);
    }
}
