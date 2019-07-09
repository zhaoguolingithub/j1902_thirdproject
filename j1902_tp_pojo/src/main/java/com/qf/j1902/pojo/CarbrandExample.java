package com.qf.j1902.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarbrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarbrandExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("brandname is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("brandname is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("brandname =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("brandname <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("brandname >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("brandname >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("brandname <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("brandname <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("brandname like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("brandname not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("brandname in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("brandname not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("brandname between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("brandname not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameIsNull() {
            addCriterion("otherbrandname is null");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameIsNotNull() {
            addCriterion("otherbrandname is not null");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameEqualTo(String value) {
            addCriterion("otherbrandname =", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameNotEqualTo(String value) {
            addCriterion("otherbrandname <>", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameGreaterThan(String value) {
            addCriterion("otherbrandname >", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("otherbrandname >=", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameLessThan(String value) {
            addCriterion("otherbrandname <", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameLessThanOrEqualTo(String value) {
            addCriterion("otherbrandname <=", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameLike(String value) {
            addCriterion("otherbrandname like", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameNotLike(String value) {
            addCriterion("otherbrandname not like", value, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameIn(List<String> values) {
            addCriterion("otherbrandname in", values, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameNotIn(List<String> values) {
            addCriterion("otherbrandname not in", values, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameBetween(String value1, String value2) {
            addCriterion("otherbrandname between", value1, value2, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andOtherbrandnameNotBetween(String value1, String value2) {
            addCriterion("otherbrandname not between", value1, value2, "otherbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameIsNull() {
            addCriterion("englishbrandname is null");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameIsNotNull() {
            addCriterion("englishbrandname is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameEqualTo(String value) {
            addCriterion("englishbrandname =", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameNotEqualTo(String value) {
            addCriterion("englishbrandname <>", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameGreaterThan(String value) {
            addCriterion("englishbrandname >", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("englishbrandname >=", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameLessThan(String value) {
            addCriterion("englishbrandname <", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameLessThanOrEqualTo(String value) {
            addCriterion("englishbrandname <=", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameLike(String value) {
            addCriterion("englishbrandname like", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameNotLike(String value) {
            addCriterion("englishbrandname not like", value, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameIn(List<String> values) {
            addCriterion("englishbrandname in", values, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameNotIn(List<String> values) {
            addCriterion("englishbrandname not in", values, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameBetween(String value1, String value2) {
            addCriterion("englishbrandname between", value1, value2, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andEnglishbrandnameNotBetween(String value1, String value2) {
            addCriterion("englishbrandname not between", value1, value2, "englishbrandname");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNull() {
            addCriterion("countryid is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("countryid is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(Integer value) {
            addCriterion("countryid =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(Integer value) {
            addCriterion("countryid <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(Integer value) {
            addCriterion("countryid >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("countryid >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(Integer value) {
            addCriterion("countryid <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(Integer value) {
            addCriterion("countryid <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<Integer> values) {
            addCriterion("countryid in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<Integer> values) {
            addCriterion("countryid not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(Integer value1, Integer value2) {
            addCriterion("countryid between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(Integer value1, Integer value2) {
            addCriterion("countryid not between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNull() {
            addCriterion("logourl is null");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNotNull() {
            addCriterion("logourl is not null");
            return (Criteria) this;
        }

        public Criteria andLogourlEqualTo(String value) {
            addCriterion("logourl =", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotEqualTo(String value) {
            addCriterion("logourl <>", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThan(String value) {
            addCriterion("logourl >", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("logourl >=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThan(String value) {
            addCriterion("logourl <", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThanOrEqualTo(String value) {
            addCriterion("logourl <=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLike(String value) {
            addCriterion("logourl like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotLike(String value) {
            addCriterion("logourl not like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlIn(List<String> values) {
            addCriterion("logourl in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotIn(List<String> values) {
            addCriterion("logourl not in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlBetween(String value1, String value2) {
            addCriterion("logourl between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotBetween(String value1, String value2) {
            addCriterion("logourl not between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogomeaningIsNull() {
            addCriterion("logomeaning is null");
            return (Criteria) this;
        }

        public Criteria andLogomeaningIsNotNull() {
            addCriterion("logomeaning is not null");
            return (Criteria) this;
        }

        public Criteria andLogomeaningEqualTo(String value) {
            addCriterion("logomeaning =", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningNotEqualTo(String value) {
            addCriterion("logomeaning <>", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningGreaterThan(String value) {
            addCriterion("logomeaning >", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningGreaterThanOrEqualTo(String value) {
            addCriterion("logomeaning >=", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningLessThan(String value) {
            addCriterion("logomeaning <", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningLessThanOrEqualTo(String value) {
            addCriterion("logomeaning <=", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningLike(String value) {
            addCriterion("logomeaning like", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningNotLike(String value) {
            addCriterion("logomeaning not like", value, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningIn(List<String> values) {
            addCriterion("logomeaning in", values, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningNotIn(List<String> values) {
            addCriterion("logomeaning not in", values, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningBetween(String value1, String value2) {
            addCriterion("logomeaning between", value1, value2, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andLogomeaningNotBetween(String value1, String value2) {
            addCriterion("logomeaning not between", value1, value2, "logomeaning");
            return (Criteria) this;
        }

        public Criteria andFirstcharIsNull() {
            addCriterion("firstchar is null");
            return (Criteria) this;
        }

        public Criteria andFirstcharIsNotNull() {
            addCriterion("firstchar is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcharEqualTo(String value) {
            addCriterion("firstchar =", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotEqualTo(String value) {
            addCriterion("firstchar <>", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharGreaterThan(String value) {
            addCriterion("firstchar >", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharGreaterThanOrEqualTo(String value) {
            addCriterion("firstchar >=", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharLessThan(String value) {
            addCriterion("firstchar <", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharLessThanOrEqualTo(String value) {
            addCriterion("firstchar <=", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharLike(String value) {
            addCriterion("firstchar like", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotLike(String value) {
            addCriterion("firstchar not like", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharIn(List<String> values) {
            addCriterion("firstchar in", values, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotIn(List<String> values) {
            addCriterion("firstchar not in", values, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharBetween(String value1, String value2) {
            addCriterion("firstchar between", value1, value2, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotBetween(String value1, String value2) {
            addCriterion("firstchar not between", value1, value2, "firstchar");
            return (Criteria) this;
        }

        public Criteria andNameallspellIsNull() {
            addCriterion("nameallspell is null");
            return (Criteria) this;
        }

        public Criteria andNameallspellIsNotNull() {
            addCriterion("nameallspell is not null");
            return (Criteria) this;
        }

        public Criteria andNameallspellEqualTo(String value) {
            addCriterion("nameallspell =", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotEqualTo(String value) {
            addCriterion("nameallspell <>", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellGreaterThan(String value) {
            addCriterion("nameallspell >", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellGreaterThanOrEqualTo(String value) {
            addCriterion("nameallspell >=", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellLessThan(String value) {
            addCriterion("nameallspell <", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellLessThanOrEqualTo(String value) {
            addCriterion("nameallspell <=", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellLike(String value) {
            addCriterion("nameallspell like", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotLike(String value) {
            addCriterion("nameallspell not like", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellIn(List<String> values) {
            addCriterion("nameallspell in", values, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotIn(List<String> values) {
            addCriterion("nameallspell not in", values, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellBetween(String value1, String value2) {
            addCriterion("nameallspell between", value1, value2, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotBetween(String value1, String value2) {
            addCriterion("nameallspell not between", value1, value2, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNull() {
            addCriterion("salestatus is null");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNotNull() {
            addCriterion("salestatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalestatusEqualTo(String value) {
            addCriterion("salestatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(String value) {
            addCriterion("salestatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(String value) {
            addCriterion("salestatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(String value) {
            addCriterion("salestatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(String value) {
            addCriterion("salestatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(String value) {
            addCriterion("salestatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLike(String value) {
            addCriterion("salestatus like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotLike(String value) {
            addCriterion("salestatus not like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<String> values) {
            addCriterion("salestatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<String> values) {
            addCriterion("salestatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(String value1, String value2) {
            addCriterion("salestatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(String value1, String value2) {
            addCriterion("salestatus not between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("isenabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("isenabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(String value) {
            addCriterion("isenabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(String value) {
            addCriterion("isenabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(String value) {
            addCriterion("isenabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(String value) {
            addCriterion("isenabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(String value) {
            addCriterion("isenabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(String value) {
            addCriterion("isenabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLike(String value) {
            addCriterion("isenabled like", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotLike(String value) {
            addCriterion("isenabled not like", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<String> values) {
            addCriterion("isenabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<String> values) {
            addCriterion("isenabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(String value1, String value2) {
            addCriterion("isenabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(String value1, String value2) {
            addCriterion("isenabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsremovedIsNull() {
            addCriterion("isremoved is null");
            return (Criteria) this;
        }

        public Criteria andIsremovedIsNotNull() {
            addCriterion("isremoved is not null");
            return (Criteria) this;
        }

        public Criteria andIsremovedEqualTo(String value) {
            addCriterion("isremoved =", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotEqualTo(String value) {
            addCriterion("isremoved <>", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedGreaterThan(String value) {
            addCriterion("isremoved >", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedGreaterThanOrEqualTo(String value) {
            addCriterion("isremoved >=", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLessThan(String value) {
            addCriterion("isremoved <", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLessThanOrEqualTo(String value) {
            addCriterion("isremoved <=", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLike(String value) {
            addCriterion("isremoved like", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotLike(String value) {
            addCriterion("isremoved not like", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedIn(List<String> values) {
            addCriterion("isremoved in", values, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotIn(List<String> values) {
            addCriterion("isremoved not in", values, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedBetween(String value1, String value2) {
            addCriterion("isremoved between", value1, value2, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotBetween(String value1, String value2) {
            addCriterion("isremoved not between", value1, value2, "isremoved");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeIsNull() {
            addCriterion("createbrandtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeIsNotNull() {
            addCriterion("createbrandtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeEqualTo(String value) {
            addCriterion("createbrandtime =", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeNotEqualTo(String value) {
            addCriterion("createbrandtime <>", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeGreaterThan(String value) {
            addCriterion("createbrandtime >", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeGreaterThanOrEqualTo(String value) {
            addCriterion("createbrandtime >=", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeLessThan(String value) {
            addCriterion("createbrandtime <", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeLessThanOrEqualTo(String value) {
            addCriterion("createbrandtime <=", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeLike(String value) {
            addCriterion("createbrandtime like", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeNotLike(String value) {
            addCriterion("createbrandtime not like", value, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeIn(List<String> values) {
            addCriterion("createbrandtime in", values, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeNotIn(List<String> values) {
            addCriterion("createbrandtime not in", values, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeBetween(String value1, String value2) {
            addCriterion("createbrandtime between", value1, value2, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andCreatebrandtimeNotBetween(String value1, String value2) {
            addCriterion("createbrandtime not between", value1, value2, "createbrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeIsNull() {
            addCriterion("updatebrandtime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeIsNotNull() {
            addCriterion("updatebrandtime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeEqualTo(String value) {
            addCriterion("updatebrandtime =", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeNotEqualTo(String value) {
            addCriterion("updatebrandtime <>", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeGreaterThan(String value) {
            addCriterion("updatebrandtime >", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeGreaterThanOrEqualTo(String value) {
            addCriterion("updatebrandtime >=", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeLessThan(String value) {
            addCriterion("updatebrandtime <", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeLessThanOrEqualTo(String value) {
            addCriterion("updatebrandtime <=", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeLike(String value) {
            addCriterion("updatebrandtime like", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeNotLike(String value) {
            addCriterion("updatebrandtime not like", value, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeIn(List<String> values) {
            addCriterion("updatebrandtime in", values, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeNotIn(List<String> values) {
            addCriterion("updatebrandtime not in", values, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeBetween(String value1, String value2) {
            addCriterion("updatebrandtime between", value1, value2, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebrandtimeNotBetween(String value1, String value2) {
            addCriterion("updatebrandtime not between", value1, value2, "updatebrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeIsNull() {
            addCriterion("syncbrandtime is null");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeIsNotNull() {
            addCriterion("syncbrandtime is not null");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeEqualTo(String value) {
            addCriterion("syncbrandtime =", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeNotEqualTo(String value) {
            addCriterion("syncbrandtime <>", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeGreaterThan(String value) {
            addCriterion("syncbrandtime >", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeGreaterThanOrEqualTo(String value) {
            addCriterion("syncbrandtime >=", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeLessThan(String value) {
            addCriterion("syncbrandtime <", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeLessThanOrEqualTo(String value) {
            addCriterion("syncbrandtime <=", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeLike(String value) {
            addCriterion("syncbrandtime like", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeNotLike(String value) {
            addCriterion("syncbrandtime not like", value, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeIn(List<String> values) {
            addCriterion("syncbrandtime in", values, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeNotIn(List<String> values) {
            addCriterion("syncbrandtime not in", values, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeBetween(String value1, String value2) {
            addCriterion("syncbrandtime between", value1, value2, "syncbrandtime");
            return (Criteria) this;
        }

        public Criteria andSyncbrandtimeNotBetween(String value1, String value2) {
            addCriterion("syncbrandtime not between", value1, value2, "syncbrandtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}