package cn.com.hypt.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefuelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefuelExample() {
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

        public Criteria andRefuelIdIsNull() {
            addCriterion("refuel_id is null");
            return (Criteria) this;
        }

        public Criteria andRefuelIdIsNotNull() {
            addCriterion("refuel_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefuelIdEqualTo(Integer value) {
            addCriterion("refuel_id =", value, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdNotEqualTo(Integer value) {
            addCriterion("refuel_id <>", value, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdGreaterThan(Integer value) {
            addCriterion("refuel_id >", value, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refuel_id >=", value, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdLessThan(Integer value) {
            addCriterion("refuel_id <", value, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdLessThanOrEqualTo(Integer value) {
            addCriterion("refuel_id <=", value, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdIn(List<Integer> values) {
            addCriterion("refuel_id in", values, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdNotIn(List<Integer> values) {
            addCriterion("refuel_id not in", values, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdBetween(Integer value1, Integer value2) {
            addCriterion("refuel_id between", value1, value2, "refuelId");
            return (Criteria) this;
        }

        public Criteria andRefuelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refuel_id not between", value1, value2, "refuelId");
            return (Criteria) this;
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

        public Criteria andRefuelAmountIsNull() {
            addCriterion("refuel_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountIsNotNull() {
            addCriterion("refuel_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountEqualTo(BigDecimal value) {
            addCriterion("refuel_amount =", value, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountNotEqualTo(BigDecimal value) {
            addCriterion("refuel_amount <>", value, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountGreaterThan(BigDecimal value) {
            addCriterion("refuel_amount >", value, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refuel_amount >=", value, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountLessThan(BigDecimal value) {
            addCriterion("refuel_amount <", value, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refuel_amount <=", value, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountIn(List<BigDecimal> values) {
            addCriterion("refuel_amount in", values, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountNotIn(List<BigDecimal> values) {
            addCriterion("refuel_amount not in", values, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refuel_amount between", value1, value2, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andRefuelAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refuel_amount not between", value1, value2, "refuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountIsNull() {
            addCriterion("fuel_amount is null");
            return (Criteria) this;
        }

        public Criteria andFuelAmountIsNotNull() {
            addCriterion("fuel_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFuelAmountEqualTo(BigDecimal value) {
            addCriterion("fuel_amount =", value, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountNotEqualTo(BigDecimal value) {
            addCriterion("fuel_amount <>", value, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountGreaterThan(BigDecimal value) {
            addCriterion("fuel_amount >", value, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_amount >=", value, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountLessThan(BigDecimal value) {
            addCriterion("fuel_amount <", value, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_amount <=", value, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountIn(List<BigDecimal> values) {
            addCriterion("fuel_amount in", values, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountNotIn(List<BigDecimal> values) {
            addCriterion("fuel_amount not in", values, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_amount between", value1, value2, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andFuelAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_amount not between", value1, value2, "fuelAmount");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(BigDecimal value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(BigDecimal value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(BigDecimal value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(BigDecimal value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<BigDecimal> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<BigDecimal> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andRefuelDateIsNull() {
            addCriterion("refuel_date is null");
            return (Criteria) this;
        }

        public Criteria andRefuelDateIsNotNull() {
            addCriterion("refuel_date is not null");
            return (Criteria) this;
        }

        public Criteria andRefuelDateEqualTo(Date value) {
            addCriterion("refuel_date =", value, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateNotEqualTo(Date value) {
            addCriterion("refuel_date <>", value, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateGreaterThan(Date value) {
            addCriterion("refuel_date >", value, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("refuel_date >=", value, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateLessThan(Date value) {
            addCriterion("refuel_date <", value, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateLessThanOrEqualTo(Date value) {
            addCriterion("refuel_date <=", value, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateIn(List<Date> values) {
            addCriterion("refuel_date in", values, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateNotIn(List<Date> values) {
            addCriterion("refuel_date not in", values, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateBetween(Date value1, Date value2) {
            addCriterion("refuel_date between", value1, value2, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andRefuelDateNotBetween(Date value1, Date value2) {
            addCriterion("refuel_date not between", value1, value2, "refuelDate");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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