package cn.com.hypt.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleExample() {
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

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Integer value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Integer value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Integer value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Integer value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Integer> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Integer> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNull() {
            addCriterion("license_plate is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNotNull() {
            addCriterion("license_plate is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateEqualTo(String value) {
            addCriterion("license_plate =", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotEqualTo(String value) {
            addCriterion("license_plate <>", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThan(String value) {
            addCriterion("license_plate >", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate >=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThan(String value) {
            addCriterion("license_plate <", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThanOrEqualTo(String value) {
            addCriterion("license_plate <=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLike(String value) {
            addCriterion("license_plate like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotLike(String value) {
            addCriterion("license_plate not like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIn(List<String> values) {
            addCriterion("license_plate in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotIn(List<String> values) {
            addCriterion("license_plate not in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateBetween(String value1, String value2) {
            addCriterion("license_plate between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotBetween(String value1, String value2) {
            addCriterion("license_plate not between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andEinIsNull() {
            addCriterion("ein is null");
            return (Criteria) this;
        }

        public Criteria andEinIsNotNull() {
            addCriterion("ein is not null");
            return (Criteria) this;
        }

        public Criteria andEinEqualTo(String value) {
            addCriterion("ein =", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinNotEqualTo(String value) {
            addCriterion("ein <>", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinGreaterThan(String value) {
            addCriterion("ein >", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinGreaterThanOrEqualTo(String value) {
            addCriterion("ein >=", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinLessThan(String value) {
            addCriterion("ein <", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinLessThanOrEqualTo(String value) {
            addCriterion("ein <=", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinLike(String value) {
            addCriterion("ein like", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinNotLike(String value) {
            addCriterion("ein not like", value, "ein");
            return (Criteria) this;
        }

        public Criteria andEinIn(List<String> values) {
            addCriterion("ein in", values, "ein");
            return (Criteria) this;
        }

        public Criteria andEinNotIn(List<String> values) {
            addCriterion("ein not in", values, "ein");
            return (Criteria) this;
        }

        public Criteria andEinBetween(String value1, String value2) {
            addCriterion("ein between", value1, value2, "ein");
            return (Criteria) this;
        }

        public Criteria andEinNotBetween(String value1, String value2) {
            addCriterion("ein not between", value1, value2, "ein");
            return (Criteria) this;
        }

        public Criteria andStyleIdIsNull() {
            addCriterion("style_id is null");
            return (Criteria) this;
        }

        public Criteria andStyleIdIsNotNull() {
            addCriterion("style_id is not null");
            return (Criteria) this;
        }

        public Criteria andStyleIdEqualTo(String value) {
            addCriterion("style_id =", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotEqualTo(String value) {
            addCriterion("style_id <>", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdGreaterThan(String value) {
            addCriterion("style_id >", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdGreaterThanOrEqualTo(String value) {
            addCriterion("style_id >=", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLessThan(String value) {
            addCriterion("style_id <", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLessThanOrEqualTo(String value) {
            addCriterion("style_id <=", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLike(String value) {
            addCriterion("style_id like", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotLike(String value) {
            addCriterion("style_id not like", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdIn(List<String> values) {
            addCriterion("style_id in", values, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotIn(List<String> values) {
            addCriterion("style_id not in", values, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdBetween(String value1, String value2) {
            addCriterion("style_id between", value1, value2, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotBetween(String value1, String value2) {
            addCriterion("style_id not between", value1, value2, "styleId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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