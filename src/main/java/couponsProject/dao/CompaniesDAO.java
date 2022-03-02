package couponsProject.dao;

import couponsProject.beans.Company;

import java.util.List;
import java.util.Map;

public interface CompaniesDAO {

    boolean isCompanyExist(String email, String password);

    boolean addCompany(Company company);

    boolean updateCompany(Company company);

    void deleteCompany(int companyID);

    List<Company> getAllCompanies(String sql, Map<Integer, Object> values);

    Company getOneCompany(int companyID);


}
