package cn.com.hypt.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyStatExample() {
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

        public Criteria andDailyStatIdIsNull() {
            addCriterion("daily_stat_id is null");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdIsNotNull() {
            addCriterion("daily_stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdEqualTo(Integer value) {
            addCriterion("daily_stat_id =", value, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdNotEqualTo(Integer value) {
            addCriterion("daily_stat_id <>", value, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdGreaterThan(Integer value) {
            addCriterion("daily_stat_id >", value, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_stat_id >=", value, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdLessThan(Integer value) {
            addCriterion("daily_stat_id <", value, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("daily_stat_id <=", value, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdIn(List<Integer> values) {
            addCriterion("daily_stat_id in", values, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdNotIn(List<Integer> values) {
            addCriterion("daily_stat_id not in", values, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdBetween(Integer value1, Integer value2) {
            addCriterion("daily_stat_id between", value1, value2, "dailyStatId");
            return (Criteria) this;
        }

        public Criteria andDailyStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_stat_id not between", value1, value2, "dailyStatId");
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

        public Criteria andOccurDateIsNull() {
            addCriterion("occur_date is null");
            return (Criteria) this;
        }

        public Criteria andOccurDateIsNotNull() {
            addCriterion("occur_date is not null");
            return (Criteria) this;
        }

        public Criteria andOccurDateEqualTo(Date value) {
            addCriterion("occur_date =", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotEqualTo(Date value) {
            addCriterion("occur_date <>", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateGreaterThan(Date value) {
            addCriterion("occur_date >", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateGreaterThanOrEqualTo(Date value) {
            addCriterion("occur_date >=", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateLessThan(Date value) {
            addCriterion("occur_date <", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateLessThanOrEqualTo(Date value) {
            addCriterion("occur_date <=", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateIn(List<Date> values) {
            addCriterion("occur_date in", values, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotIn(List<Date> values) {
            addCriterion("occur_date not in", values, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateBetween(Date value1, Date value2) {
            addCriterion("occur_date between", value1, value2, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotBetween(Date value1, Date value2) {
            addCriterion("occur_date not between", value1, value2, "occurDate");
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

        public Criteria andRefuelIsNull() {
            addCriterion("refuel is null");
            return (Criteria) this;
        }

        public Criteria andRefuelIsNotNull() {
            addCriterion("refuel is not null");
            return (Criteria) this;
        }

        public Criteria andRefuelEqualTo(BigDecimal value) {
            addCriterion("refuel =", value, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelNotEqualTo(BigDecimal value) {
            addCriterion("refuel <>", value, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelGreaterThan(BigDecimal value) {
            addCriterion("refuel >", value, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refuel >=", value, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelLessThan(BigDecimal value) {
            addCriterion("refuel <", value, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refuel <=", value, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelIn(List<BigDecimal> values) {
            addCriterion("refuel in", values, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelNotIn(List<BigDecimal> values) {
            addCriterion("refuel not in", values, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refuel between", value1, value2, "refuel");
            return (Criteria) this;
        }

        public Criteria andRefuelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refuel not between", value1, value2, "refuel");
            return (Criteria) this;
        }

        public Criteria andFuelIncountIsNull() {
            addCriterion("fuel_incount is null");
            return (Criteria) this;
        }

        public Criteria andFuelIncountIsNotNull() {
            addCriterion("fuel_incount is not null");
            return (Criteria) this;
        }

        public Criteria andFuelIncountEqualTo(BigDecimal value) {
            addCriterion("fuel_incount =", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountNotEqualTo(BigDecimal value) {
            addCriterion("fuel_incount <>", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountGreaterThan(BigDecimal value) {
            addCriterion("fuel_incount >", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_incount >=", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountLessThan(BigDecimal value) {
            addCriterion("fuel_incount <", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_incount <=", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountIn(List<BigDecimal> values) {
            addCriterion("fuel_incount in", values, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountNotIn(List<BigDecimal> values) {
            addCriterion("fuel_incount not in", values, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_incount between", value1, value2, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_incount not between", value1, value2, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountIsNull() {
            addCriterion("mileage_incount is null");
            return (Criteria) this;
        }

        public Criteria andMileageIncountIsNotNull() {
            addCriterion("mileage_incount is not null");
            return (Criteria) this;
        }

        public Criteria andMileageIncountEqualTo(BigDecimal value) {
            addCriterion("mileage_incount =", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountNotEqualTo(BigDecimal value) {
            addCriterion("mileage_incount <>", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountGreaterThan(BigDecimal value) {
            addCriterion("mileage_incount >", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage_incount >=", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountLessThan(BigDecimal value) {
            addCriterion("mileage_incount <", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage_incount <=", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountIn(List<BigDecimal> values) {
            addCriterion("mileage_incount in", values, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountNotIn(List<BigDecimal> values) {
            addCriterion("mileage_incount not in", values, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage_incount between", value1, value2, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage_incount not between", value1, value2, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmIsNull() {
            addCriterion("fuel_per_100km is null");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmIsNotNull() {
            addCriterion("fuel_per_100km is not null");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km =", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmNotEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km <>", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmGreaterThan(BigDecimal value) {
            addCriterion("fuel_per_100km >", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km >=", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmLessThan(BigDecimal value) {
            addCriterion("fuel_per_100km <", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km <=", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmIn(List<BigDecimal> values) {
            addCriterion("fuel_per_100km in", values, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmNotIn(List<BigDecimal> values) {
            addCriterion("fuel_per_100km not in", values, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_per_100km between", value1, value2, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_per_100km not between", value1, value2, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmIsNull() {
            addCriterion("fee_per_100km is null");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmIsNotNull() {
            addCriterion("fee_per_100km is not null");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km =", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmNotEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km <>", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmGreaterThan(BigDecimal value) {
            addCriterion("fee_per_100km >", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km >=", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmLessThan(BigDecimal value) {
            addCriterion("fee_per_100km <", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km <=", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmIn(List<BigDecimal> values) {
            addCriterion("fee_per_100km in", values, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmNotIn(List<BigDecimal> values) {
            addCriterion("fee_per_100km not in", values, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_per_100km between", value1, value2, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_per_100km not between", value1, value2, "feePer100km");
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